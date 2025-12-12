public class FromOneToN {

    public static void printNumbersAscending(int n) {
        if (n == 0) return;
        printNumbersAscending(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        System.out.println("Числа от 1 до 5:");
        printNumbersAscending(5);
        System.out.println();
    }
}