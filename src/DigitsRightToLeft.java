public class DigitsRightToLeft {

    public static void printDigitsReverse(int n) {
        if (n < 10) {
            System.out.print(n + " ");
        } else {
            System.out.print(n % 10 + " ");
            printDigitsReverse(n / 10);
        }
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Цифры числа " + number + " справа налево:");
        printDigitsReverse(number);
        System.out.println();
    }
}