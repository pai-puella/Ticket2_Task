public class PalindromeChecker {
    // Метод, который проверяет, является ли строка палиндромом
    public static boolean isPalindrome(String str) {
        //Удаляем все пробелы и приводим регистру
        String processedStr = str.replaceAll("\\s", "").toLowerCase();
        //Переменные для хранения индексов
        int start = 0;
        int end = processedStr.length() - 1;

        while (start < end) {
            if (processedStr.charAt(start) != processedStr.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        //Если все символы совпали, то строка палиндром
        return true;
    }

    public static void main(String[] args) {
        String str = "Fpfkdmdmdndvjgj";
        if (isPalindrome(str)) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }
}
