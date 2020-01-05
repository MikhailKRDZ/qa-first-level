package fundamentals.maintask;

public class Task3 {
    public static void main(String[] args) {
        int[] randomNumbers = {1, 2, 3, 4, 5};

        for (int i : randomNumbers) {
            System.out.println(i);
        }
        for (int i : randomNumbers) {
            System.out.print(i);
        }
    }
}