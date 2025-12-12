import java.util.Scanner;

public class PrintOddNumbers {

    public static void printOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        printOddNumbersRecursive(scanner);
    }

    private static void printOddNumbersRecursive(Scanner scanner) {
        int num = scanner.nextInt();

        if (num == 0) {
            return;
        }

        // Если число нечетное - выводим его
        if (num % 2 != 0) {
            System.out.println(num);
        }

        // Шаг рекурсии
        printOddNumbersRecursive(scanner);
    }

    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел (завершите нулем):");
        printOddNumbers();
    }
}