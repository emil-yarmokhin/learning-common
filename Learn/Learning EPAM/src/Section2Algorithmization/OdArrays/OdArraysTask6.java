package Section2Algorithmization.OdArrays;

import java.util.Arrays;
import java.util.Random;

//6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются
// простыми числами.
public class OdArraysTask6 {
    public static void main(String[] args) {
        Random r = new Random();
        double cou = 0;
        int n = 12;
        double[] array = new double[n];

        System.out.println("Изначальный массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (r.nextDouble());
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Порядковые номера чисел, которые будут суммироваться в этом массиве - простые числа: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (r.nextDouble());
            int k1 = 0;
            for (int j = 2; j <= i; j++) {
                if ((i % j) == 0) {
                    k1++;
                }
            }
            if ((k1 < 2) && (i >= 2)) {
                cou += array[i];
                System.out.print(i + " ");
            } else {
                array[i] = 0;
            }
        }
        System.out.print("\nСумма вещественных чисел, порядковые номера которых являются вещественными числами c точностью до сотых:");
        System.out.format("\n%.2f\n", cou);//у меня не получилось перевести массив в строку, чтобы она отображала
        //вещественные числа с точностью до сотых. Оставляю пока до времён, пока не узнаю, как это делать. Пробовал и
        //через Decimal, и через String str = ""; технически требования задание выполнено, но хочу улучшить.
    }
}