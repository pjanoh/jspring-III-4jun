public class TextManager extends BaseManager {
    private int[] lastDays = new int[12];

    public TextManager(String path) {
        String[] lines = readLines(path);
        for (int i = 0; i < lines.length; i += 3) {
            int month = Integer.parseInt(lines[i]) - 1;
            int profit = Integer.parseInt(lines[i + 1]);
            int lastDay = Integer.parseInt(lines[i + 2]);
            profits[month] = profit;
            lastDays[month] = lastDay;
        }
    }



    // last days
}
