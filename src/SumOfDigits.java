public class SumOfDigits {

    public static int sumDigits(int n) {
        // Базовый случай: если число состоит из одной цифры
        if (n < 10) {
            return n;
        }
        // Шаг рекурсии - последняя цифра + сумма остальных цифр
        return n % 10 + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Сумма цифр числа " + number + ": " + sumDigits(number));
    }
}