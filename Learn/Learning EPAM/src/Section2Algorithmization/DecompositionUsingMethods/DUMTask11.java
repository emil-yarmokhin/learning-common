package Section2Algorithmization.DecompositionUsingMethods;

import static java.lang.Math.abs;

/*11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.*/
public class DUMTask11 {
    public static void main(String[] args) {
        int num1 = 684455;
        int num2 = -543245;
        int num1Count = countDigits(num1);
        int num2Count = countDigits(num2);
        System.out.print("Даны числа: " + num1 + " и " + num2 + ". ");
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
        String a;
        if (num1Count == num2Count) {
            a = "количество цифр в числах одинаково";
        } else if (abs(num1) > abs(num2)) {
            a = Integer.toString(num1);
        } else {
            a = Integer.toString(num2);
        }
        return a;
    }
}