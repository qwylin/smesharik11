public class PrimeCheck {

    public static boolean isPrime(int n) {
        return isPrimeRecursive(n, 2);
    }

    private static boolean isPrimeRecursive(int n, int divisor) {
        if (n <= 2) {
            return n == 2;
        }
        if (n % divisor == 0) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }
        // Шаг рекурсии - проверяем следующий делитель
        return isPrimeRecursive(n, divisor + 1);
    }

    public static void main(String[] args) {
        int number = 17;
        System.out.println(number + " является простым? " + (isPrime(number) ? "YES" : "NO"));

        number = 15;
        System.out.println(number + " является простым? " + (isPrime(number) ? "YES" : "NO"));
    }
}