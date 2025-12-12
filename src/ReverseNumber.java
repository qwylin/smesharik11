public class ReverseNumber {

    public static int reverseNumber(int n) {
        return reverseRecursive(n, 0);
    }

    private static int reverseRecursive(int n, int reversed) {
        // Число полностью развернуто
        if (n == 0) {
            return reversed;
        }
        // Шаг рекурсии - добавляем последнюю цифру к развернутому числу
        return reverseRecursive(n / 10, reversed * 10 + n % 10);
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Исходное число: " + number);
        System.out.println("Развернутое число: " + reverseNumber(number));
    }
}