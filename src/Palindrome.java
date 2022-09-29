//Класс работы со словами палиндромами
public class Palindrome {
    //Точка входа в программу, перебирает аргументы командной строки, проверяя является ли палиндромом каждый из них.
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(s + " isPalindrome: " + isPalindrome(s));
        }
    }

    //Функция разворота строк, генерирует новую строку, перевёрнутую заданной
    public static String reverseString(String str){
        String new_str = "";
        for(int i = str.length() - 1; i > -1; i--)new_str += str.charAt(i);
        return new_str;
    }

    //Получился декоратор, функция определяет является ли строка(агрумент) палиндромом, сравнивая исходную и перевёрнутую строки
    public static boolean isPalindrome(String str){
        return str.equals(reverseString(str));
    }
}