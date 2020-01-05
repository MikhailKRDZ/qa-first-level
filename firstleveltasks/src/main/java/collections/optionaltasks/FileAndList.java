package collections.optionaltasks;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileAndList {
    public static void main(String[] args) throws Exception {
        List<String> listFromFile = Files.readAllLines(Paths.get("File.txt"));
        PrintWriter printWriter = new PrintWriter("File.txt");
        for (int i = 0; i < listFromFile.size(); i++) {
            printWriter.println(listFromFile.get(listFromFile.size() - i - 1));
        }
        printWriter.close();
    }
}
