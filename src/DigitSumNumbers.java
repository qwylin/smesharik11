public class DigitSumNumbers {

    public static int countNumbers(int k, int s) {
        return countNumbersRecursive(k, s, 0, 0, true);
    }

    private static int countNumbersRecursive(int k, int s, int currentSum, int currentLength, boolean isFirstDigit) {
        // если набрали k цифр
        if (currentLength == k) {
            return currentSum == s ? 1 : 0;
        }

        int count = 0;
        int startDigit = isFirstDigit ? 1 : 0; // Первая цифра не может быть 0

        for (int digit = startDigit; digit <= 9; digit++) {
            if (currentSum + digit <= s) {
                count += countNumbersRecursive(k, s, currentSum + digit, currentLength + 1, false);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int k = 3, s = 6;
        System.out.println("Количество " + k + "-значных чисел с суммой цифр " + s + ": " + countNumbers(k, s));
    }
}