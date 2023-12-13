package Practic10;

public class Reverse
{
    public static void main(String[] args)
    {
        int n = 625468;

        int reversedNumber = reverseNumber(n);
        System.out.println(reversedNumber);
    }

    public static int reverseNumber(int n)
    {
        if (n < 10)
        {
            return n; // Базовый случай: если число состоит из одной цифры, возвращаем его же.
        }
        else
        {
            int lastDigit = n % 10; // Получаем последнюю цифру числа.
            int remainingDigits = n / 10; // Получаем все остальные цифры числа.

            int numDigits = (int) Math.log10(remainingDigits) + 1; // Количество цифр в остальных числах.

            int reversedRemaining = reverseNumber(remainingDigits); // Рекурсивно инвертируем остальные цифры.

            return lastDigit * (int) Math.pow(10, numDigits) + reversedRemaining; // Возвращаем число, составленное из инвертированных цифр и последней цифры.
        }
    }
}
