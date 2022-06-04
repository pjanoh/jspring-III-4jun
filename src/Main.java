import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        TextManager manager = new TextManager("resources/year.txt");

        final String[] names = {"Sergey", "Anya", "Katya"};
        names[0] = "Kolya";

        //names = {""};
    }

}
