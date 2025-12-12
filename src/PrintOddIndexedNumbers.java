import java.util.Scanner;

public class PrintOddIndexedNumbers {

    public static void printOddIndexedNumbers() {
        Scanner scanner = new Scanner(System.in);
        printOddIndexedRecursive(scanner, 1);
    }

    private static void printOddIndexedRecursive(Scanner scanner, int index) {
        int num = scanner.nextInt();

        // Базовый случай: ноль
        if (num == 0) {
            return;
        }

        // Если индекс нечетный - выводим число
        if (index % 2 != 0) {
            System.out.println(num);
        }

        // Шаг рекурсии: увеличиваем индекс
        printOddIndexedRecursive(scanner, index + 1);
    }

    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел (завершите нулем):");
        printOddIndexedNumbers();
    }
}