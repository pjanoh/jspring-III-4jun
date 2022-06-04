import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BaseManager {
    protected final int[] profits = new int[12];

    protected String readFileContentsOrNull(String path) {
        try {
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл с месячным отчётом. Возможно, файл не находится в нужной директории.");
            return null;
        }
    }

    protected String[] readLines(String path) {
        String text = readFileContentsOrNull(path);
        String[] lines = text.split("\r?\n");
        return lines;
    }

    public int sumProfit() {
        int sum = 0;
        for (int profit : profits) {
            sum += profit;
        }
        return sum;
    }
}
