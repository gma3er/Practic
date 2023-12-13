package Practic10;

public class Palindrom
{
    public static void main(String[] args)
    {
        String word = "cat"; // заданное слово для проверки

        boolean isPalindrome = isPalindrome(word);

        if (isPalindrome)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }

    public static boolean isPalindrome(String word)
    {
        if (word.length() <= 1)
        {
            return true;
        }

        return word.charAt(0) == word.charAt(word.length() - 1) && isPalindrome(word.substring(1, word.length() - 1));
    }
}