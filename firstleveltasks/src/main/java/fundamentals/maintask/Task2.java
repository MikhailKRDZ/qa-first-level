package fundamentals.maintask;

public class Task2 {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.print("Aргументы командной строки в обратном порядке : ");
            for (int i = args.length; i > 0; i--) {
                System.out.print(args[i - 1] + ", ");
            }
        }
    }
}
