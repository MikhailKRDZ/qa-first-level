package classes.maintask.output;

import classes.maintask.datastudents.Student;

import java.util.ArrayList;

public class Printer {

    public static void printStudents(Student[] students) {
        System.out.println("Массив объектов");
        StringBuilder stringBuilder = new StringBuilder();
        String[][] arrayToPrint = getArrayToPrint(students, stringBuilder);
        stringBuilder.delete(0, stringBuilder.length());
        int[] maxSizeColumn = getMaxColumnValue(arrayToPrint);
        print(maxSizeColumn, arrayToPrint, stringBuilder);
    }

    public static void printStudents(ArrayList<String> arrayList) {
        System.out.println(arrayList.get(0));
        StringBuilder stringBuilder = new StringBuilder();
        String[][] arrayToPrint = getArrayToPrint(arrayList, stringBuilder);
        stringBuilder.delete(0, stringBuilder.length());
        int[] maxSizeColumn = getMaxColumnValue(arrayToPrint);
        print(maxSizeColumn, arrayToPrint, stringBuilder);
    }

   private static int[] getMaxColumnValue(String[][] arrayToPrint) {
        int[] maxSizeColumn = new int[arrayToPrint[0].length];
        int linesNumber = arrayToPrint.length;
        int columnsNumber = arrayToPrint[0].length;
        for (int i = 0; i < linesNumber; i++) {
            for (int j = 0; j < columnsNumber; j++) {
                int columnSize = 1 + arrayToPrint[i][j].chars().toArray().length;
                if (i == 0) {
                    maxSizeColumn[j] = columnSize;
                } else if (maxSizeColumn[j] < columnSize) {
                    maxSizeColumn[j] = columnSize;
                }
            }
        }
        return maxSizeColumn;
    }

   private static void print(int[] maxSizeColumn, String[][] arrayToPrint, StringBuilder stringBuilder) {
        int linesNumber = arrayToPrint.length;
        int columnsNumber = arrayToPrint[0].length;
        for (int i = 0; i < linesNumber; i++) {
            if (i == 0) {
                System.out.printf("%1$-7s", "№п.п");
            } else {
                System.out.printf("%1$-7s", i);
            }
            for (int j = 0; j < columnsNumber; j++) {
                stringBuilder.append("%1$-");
                stringBuilder.append(maxSizeColumn[j]);
                stringBuilder.append("s");
                if (j == columnsNumber - 1) {
                    stringBuilder.append("\n");
                }
                System.out.printf(stringBuilder.toString(), arrayToPrint[i][j]);
                stringBuilder.delete(0, stringBuilder.length());
            }
        }
        System.out.println();
    }

    private static String [][] getArrayToPrint(ArrayList<String> arrayList,StringBuilder stringBuilder) {
        int linesNumber = arrayList.size() - 1;
        int columnsNumber = arrayList.get(1).length() - arrayList.get(1).replace("\t", "").length();
        String[][] arrayToPrint = new String[linesNumber][columnsNumber];
        String headlines = arrayList.get(1);
        for (int i = 0; i < linesNumber; i++) {
            stringBuilder.delete(0, stringBuilder.length());
            if (i == 0) {
                stringBuilder.append(headlines);
            } else {
                stringBuilder.append(arrayList.get(i + 1));
            }
            for (int j = 0; j < columnsNumber; j++) {
                int columnSize = 1 + stringBuilder.indexOf("\t");
                arrayToPrint[i][j] = stringBuilder.substring(0, columnSize - 1);
                stringBuilder.delete(0, columnSize);
            }
        }
        return arrayToPrint;
    }

    private static String [][] getArrayToPrint(Student[] students,StringBuilder stringBuilder) {
        int linesNumber = students.length;
        int columnsNumber = students[0].toString().length() - students[0].toString().replace("\t", "").length();
        String[][] arrayToPrint = new String[linesNumber + 1][columnsNumber];
        String headlines = students[0].getHeadlines();
        for (int i = 0; i < linesNumber+1; i++) {
            stringBuilder.delete(0, stringBuilder.length());
            if (i == 0) {
                stringBuilder.append(headlines);
            } else {
                stringBuilder.append(students[i - 1].toString()); ///
            }
            for (int j = 0; j < columnsNumber; j++) {
                int columnSize = 1 + stringBuilder.indexOf("\t");
                arrayToPrint[i][j] = stringBuilder.substring(0, columnSize - 1);
                stringBuilder.delete(0, columnSize);
            }
        }
        stringBuilder.delete(0, stringBuilder.length());
        int[] maxSizeColumn = getMaxColumnValue(arrayToPrint);
        print(maxSizeColumn, arrayToPrint, stringBuilder);
        return arrayToPrint;
    }
}