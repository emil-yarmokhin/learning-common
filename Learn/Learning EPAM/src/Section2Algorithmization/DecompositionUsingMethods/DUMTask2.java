package Section2Algorithmization.DecompositionUsingMethods;

import static java.lang.Math.max;

//2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
/*КОММЕНТАРИЙ К ВЫПОЛНЕННОЙ ЗАДАЧЕ. ЗАДАЧА ПРЕКРАСНО РЕШАЕТСЯ, ЕСЛИ СОЗДАТЬ МАССИВ ИЗ ЗНАЧЕНИЙ a,b,c,d, и РАБОТАТЬ С НИМИ
 * ЧЕРЕЗ ОБЫЧНЫЙ ЦИКЛ. РЕШЕНИЕ ПОЗВОЛЯЕТ НАЙТИ НОД ЛЮБОГО КОЛ-ВА ЧИСЕЛ, ГЛАВНОЕ ВСЕ ИХ ВНЕСТИ В МАССИВ*/
public class DUMTask2 {
    public static void main(String[] args) {
        int a = 128;
        int b = 32;
        int c = 32;
        int d = 64;
        int max1 = evklidAlgorithm(a, b);
        int max2 = evklidAlgorithm(b, c);
        int max3 = evklidAlgorithm(c, d);
        int nod1 = minimum(max1, max2);
        int nod2 = minimum(max2, max3);
        final int nod = minimum(nod1, nod2);
        System.out.println("Программа выводит наибольший общий делитель 4 любых натуральных чисел:");
        System.out.println("НОД (" + a + ", " + b + ", " + c + ", " + d + "): " + nod);
    }

    private static int minimum(int m1, int m2) {
        return Math.min(m1, m2);
    }

    public static int evklidAlgorithm(int tempA, int tempB) {
        while (tempA != 0 && tempB != 0) {
            if (tempA > tempB) {
                tempA %= tempB;
            } else {
                tempB %= tempA;
            }
        }
        return max(tempA, tempB);
    }
}