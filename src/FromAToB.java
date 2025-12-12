public class FromAToB {

    public static void printRange(int a, int b) {
        if (a == b) {
            System.out.print(a + " ");
        } else if (a < b) {
            System.out.print(a + " ");
            printRange(a + 1, b);
        } else {
            System.out.print(a + " ");
            printRange(a - 1, b);
        }
    }

    public static void main(String[] args) {
        System.out.println("От 3 до 7:");
        printRange(3, 7);
        System.out.println();

        System.out.println("От 7 до 3:");
        printRange(7, 3);
        System.out.println();
    }
}