package Section2Algorithmization.DecompositionUsingMethods;

import java.util.Arrays;

/*10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.*/
public class DUMTask10 {
    public static void main(String[] args) {
        int n = 74956;
        int[] array = new int[method1(n)];
        array[method2(n)] = method3(n);
        System.out.println(Arrays.toString(array));
    }

    public static int method1(int a) {//этот метод считает кол-во цифр в числе n
        int count = 0;
        int n = a;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int method2(int b) {//этот метод указывает, какой по счёту элемент нужно изменить
        b = method1(b);
        if (b != 0) {
            b--;
        }
        return b;
    }

    public static int method3(int c) {//этот метод указывает индекс элемента, который нужно вывести
        int s = c;
        if (c != 0) {
            s = c;
            s = s % 10;
            c /= 10;
        }
        return s;
    }
}