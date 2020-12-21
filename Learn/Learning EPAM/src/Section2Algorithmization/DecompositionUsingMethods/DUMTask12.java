package Section2Algorithmization.DecompositionUsingMethods;

import java.util.Arrays;

/*12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа,
сумма цифр которых равна К и которые не большее N.*/
public class DUMTask12 {
    public static void main(String[] args) {
        int n = 52;
        int k = 7;
        int[] a = new int[arrayLength(n, k)];
        digits(n, k, a);
        System.out.println(Arrays.toString(a));
    }


    public static int arrayLength(int n, int k) {//этот метод возвращает кол-во элементов массива n
        int count2 = 0;
        for (int i = 0; i <= n; i++) {
            int count = 0;
            count = getCount(i, count);
            if (count == k) {
                count2++;
            }
        }
        return count2;
    }

    private static int getCount(int box, int count) {
        while (box != 0) {
            count += box % 10;
            box /= 10;
        }
        return count;
    }

    public static void digits(int n, int k, int[] a) {//этот метод заполняет массив n
        int j = 0;
        for (int i = 0; i <= n; i++) {
            int count = 0;
            count = getCount(i, count);
            if (count == k) {
                a[j] = i;
                j++;
            }
        }

    }
}