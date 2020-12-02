package Section2Algorithmization.Sorting;

import java.util.Arrays;
import java.util.Random;

/*1. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
при этом не используя дополнительный массив.*/
public class SortingTask1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int k = 1;
        int n1 = 6;
        int n2 = 3;
        int[] a = new int[n1];
        int[] b = new int[n2];
        int[] c = new int[n1 + n2];

        System.out.println("Ниже представлены два одномерных массива с различным количеством элементов:");
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < b.length; i++) {
            b[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(b));

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < b.length; j++) {
                for (int l = 0; l < a.length; l++) {
                    if (l <= k) {
                        c[l] = a[l];
                    } else if (i == k + 1) {
                        c[k + 1 + j] = b[j];
                    } else {
                        c[l + n2] = a[l];
                    }
                }
            }
        }
        System.out.print("Объединение массивов 'a' и 'b' в массив 'c', где элементы массива 'b'");
        System.out.println(" вставлены после k-го (" + k + ") элемента массива 'a':");
        System.out.println(Arrays.toString(c));
    }
}