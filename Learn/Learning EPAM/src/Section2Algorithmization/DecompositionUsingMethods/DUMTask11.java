package Section2Algorithmization.DecompositionUsingMethods;

import static java.lang.Math.abs;

/*11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.*/
public class DUMTask11 {
    public static void main(String[] args) {
        int num1 = 684455;
        int num2 = -543215;
        int num1Count = countDigits(num1);
        int num2Count = countDigits(num2);
        System.out.print("Даны числа: \n" + num1 + "\n" + num2 + "\n");
        System.out.println("В каком из них больше цифр:\n" + maxDigits(num1, num2, num1Count, num2Count));
    }

    public static int countDigits(int num) {//считает кол-во цифр в числе
        int count = 0;
        int n = num;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static String maxDigits(int num1, int num2, int num1Count, int num2Count) {//сравнение чисел
        if (num1Count == num2Count) {
            return ("Ответ: количество цифр в обоих числах числах одинаково.");
        } else if (abs(num1) > abs(num2)) {
            return Integer.toString(num1);
        } else {
            return Integer.toString(num2);
        }
    }
}