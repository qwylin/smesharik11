public class TriangularSequence {

    public static void printTriangularSequence(int n) {
        printTriangularRecursive(n, 1, 1);
    }

    private static void printTriangularRecursive(int n, int currentNumber, int count) {
        if (n == 0) return;

        System.out.print(currentNumber + " ");

        if (count == currentNumber) {
            printTriangularRecursive(n - 1, currentNumber + 1, 1);
        } else {
            printTriangularRecursive(n - 1, currentNumber, count + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Треугольная последовательность (n=10):");
        printTriangularSequence(10);
        System.out.println();
    }
}