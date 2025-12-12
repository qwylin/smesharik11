public class DigitsLeftToRight {

    public static void printDigits(int n) {
        if (n < 10) {
            System.out.print(n + " ");
        } else {
            printDigits(n / 10);
            System.out.print(n % 10 + " ");
        }
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Цифры числа " + number + " слева направо:");
        printDigits(number);
        System.out.println();
    }
}