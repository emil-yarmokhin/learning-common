package Section2Algorithmization.Sorting;

import java.util.Arrays;
import java.util.Random;

/*1. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
при этом не используя дополнительный массив.*/
//КОММЕНТАРИЙ К ЗАДАНИЮ: В ЭТОМ ЗАДАНИИ НУЛЬ СЧИТАЮ НАТУРАЛЬНЫМ ЧИСЛОМ, Т. К. В ЯЗЫКЕ JAVA ОН СЧИТАЕТСЯ ПОЛОЖИТЕЛЬНЫМ
//ЦЕЛЫМ ЧИСЛОМ, ЧТО ПОДХОДИТ ПОД ОПРЕДЕЛЕНИЕ НАТУРАЛЬНОГО ЧИСЛА, В Т. Ч. СОГЛАСНО МЕЖДУНАРОДНОМУ СТАНДАРТУ ISO 80000-2
public class SortingTask1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int k = 13;//минимальное значение - 0
        int n1 = 15;//минимальное значение n1 == 2, т.к. n1 - величина будущего массива 'a', который должен состоять минимум
        //из двух элементов (k и k + 1)
        int n2 = 4;//минимальное значение - 0. Т. е. второй массив может состоять как из ничего, так и содержать символы.
        if (k < 0) {
            System.out.println("Число k может быть только натуральным числом (k >= 0)." + " Число " + k + " не является таковым.");
            return;
        } else if (n1 < 2 || n2 < 0) {
            System.out.println("Введённые значения переменных n1 (" + n1 + ") и n2 (" + n2 + ") не могут быть меньше 2 и 0 соответственно.");
            return;
        } else if (n1 - 1 < k) {
            System.out.println("Максимальный индекс массива 'a' (" + (n1 - 1) + ") не может быть меньше k + 1 (" + (k + 1) + ").");
            return;
        }

        int[] a = new int[n1];
        int[] b = new int[n2];
        int[] c = new int[n1 + n2];

        System.out.println("Ниже представлены два одномерных массива с различным количеством элементов:");
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(a));

        if (n2 == 0) {
            System.out.println(Arrays.toString(b));
            for (int i = 0; i < c.length; i++) {
                System.arraycopy(a, 0, c, 0, a.length);
            }
        } else {
            for (int t = 0; t < b.length; t++) {
                b[t] = rand.nextInt(100);
            }
            System.out.println(Arrays.toString(b));
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    for (int l = 0; l < a.length; l++) {
                        if (k >= i) {
                            c[l] = a[l];
                        } else if (i == k + 1) {
                            c[k + 1 + j] = b[j];
                        } else if (l >= k + 1) {
                            c[l + n2] = a[l];
                        }
                    }
                }
            }
        }
        System.out.print("Объединение массивов 'a' и 'b' в массив 'c', где элементы массива 'b'");
        System.out.println(" вставлены после k-го (" + k + ") элемента массива 'a':");
        System.out.println(Arrays.toString(c));

    }
}