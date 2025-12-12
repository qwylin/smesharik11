import java.util.Scanner;

public class CountMaxElements {

    public static void countMaxElements() {
        Scanner scanner = new Scanner(System.in);
        int[] result = countMaxRecursive(scanner);
        System.out.println("Количество элементов, равных максимуму: " + result[1]);
    }

    private static int[] countMaxRecursive(Scanner scanner) {
        int num = scanner.nextInt();

        if (num == 0) {
            return new int[]{Integer.MIN_VALUE, 0}; // {max, count}
        }

        // Шаг рекурсии - получаем результат для остальной последовательности
        int[] restResult = countMaxRecursive(scanner);
        int currentMax = restResult[0];
        int currentCount = restResult[1];

        if (num > currentMax) {
            // Нашли новый максимум
            return new int[]{num, 1};
        } else if (num == currentMax) {
            // Текущее число равно текущему максимуму
            return new int[]{currentMax, currentCount + 1};
        } else {
            // Текущее число меньше максимума
            return restResult;
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел (завершите нулем):");
        countMaxElements();
    }
}