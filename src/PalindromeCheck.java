public class PalindromeCheck {

    public static boolean isPalindrome(String word) {
        return isPalindromeRecursive(word, 0, word.length() - 1);
    }

    private static boolean isPalindromeRecursive(String word, int left, int right) {
        // Проверка всех символов
        if (left >= right) {
            return true;
        }
        // Если символы не совпадают - не палиндром
        if (word.charAt(left) != word.charAt(right)) {
            return false;
        }
        // Проверка следующей пары символов
        return isPalindromeRecursive(word, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String word1 = "radar";
        String word2 = "hello";

        System.out.println(word1 + " является палиндромом? " + (isPalindrome(word1) ? "YES" : "NO"));
        System.out.println(word2 + " является палиндромом? " + (isPalindrome(word2) ? "YES" : "NO"));
    }
}