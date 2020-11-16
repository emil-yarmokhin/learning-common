package Section2Algorithmization.OdArrays;

import java.util.Arrays;

//9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
// Если таких чисел несколько, то определить наименьшее из них.
public class OdArraysTask9 {
    public static void main(String[] args) {
        int[] a = {0,2,2,2,3,3,3,0,0,1,6};
        int[] b = new int[a.length];
        int[] c = new int[a.length];
        int count = 1;
        int minElemMaxTimes = 0;
        int maxTimes = 0;

        //копируем в массив b повторяющиеся значения. Неповторяющиеся значения заменяются нулями
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    b[i] = a[i];
                    b[j] = a[j];
                    count++;
                    c[i] = count;
                }
            }
            count = 1;
        }
        //находим наиболее часто встречающееся число с наименьшим значением
        for (int i = 0; i < c.length; i++) {
            if (i == 0) {
                maxTimes = c[i];
                minElemMaxTimes = b[i];
            } else if (c[i] > maxTimes) {
                maxTimes = c[i];
                minElemMaxTimes = b[i];
            } else if ((c[i] == maxTimes) && (b[i] < minElemMaxTimes)) {
                minElemMaxTimes = b[i];
            }
        }
        System.out.print("Наиболее часто встречающееся число в массиве 'a' с наименьшим значением: " + minElemMaxTimes);
        System.out.println(", встречается " + maxTimes + " раз(а).");
        System.out.println(Arrays.toString(a));
    }
}