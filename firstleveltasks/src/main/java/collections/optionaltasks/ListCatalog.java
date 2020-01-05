package collections.optionaltasks;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListCatalog {
    public static void main(String[] args) {
        System.out.println("Введите путь к каталогу и нажмите <Enter>:");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        List<String> listOfCatalogItemsAndItsSubdirectories = new ArrayList<>();

        Path parent = Paths.get(inputString);
        try {
            Files.walkFileTree(parent, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                    int count = dir.getNameCount() - parent.getNameCount() + 1;
                    count += dir.getFileName().toString().length();
                    String text = String.format("%" + count + "s", dir.getFileName());
                    text = text.replaceAll("[\\s]", "-");
                    listOfCatalogItemsAndItsSubdirectories.add(text);
                    return FileVisitResult.CONTINUE;
                }
            });
            for (String string : listOfCatalogItemsAndItsSubdirectories) {
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
