import java.util.Scanner;

public class CountOnes {

    public static int countOnes() {
        Scanner scanner = new Scanner(System.in);
        return countOnesRecursive(scanner);
    }

    private static int countOnesRecursive(Scanner scanner) {
        int num = scanner.nextInt();

        // Базовый случай: два нуля подряд
        if (num == 0) {
            int nextNum = scanner.nextInt();
            if (nextNum == 0) {
                return 0;
            } else {
                return (nextNum == 1 ? 1 : 0) + countOnesRecursive(scanner);
            }
        }

        // Шаг рекурсии
        return (num == 1 ? 1 : 0) + countOnesRecursive(scanner);
    }

    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел (завершите двумя нулями подряд):");
        int result = countOnes();
        System.out.println("Количество единиц в последовательности: " + result);
    }
}