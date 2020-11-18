package Section2Algorithmization.OdArrays;

import java.util.Arrays;

//9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
// Если таких чисел несколько, то определить наименьшее из них.
public class OdArraysTask9 {
    public static void main(String[] args) {
        int[] a = {0,2,2,3,3,1,1,1,1,6,0,0};
        int[] b = new int[a.length];
        int[] c = new int[a.length];
        int count = 1;
        int minElemMaxTimes = 0;
        int maxTimes = 0;

        //копируем в массив b повторяющиеся значения. Неповторяющиеся значения заменяются нулями
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    c[i] = 1;
                    b[i] = a[i];
                    count++;
                    c[i] = count;
                    maxTimes = c[i];
                }
            }
            count = 1;
        }
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        //находим наиболее часто встречающееся число с наименьшим значением
        for (int i = 0; i < c.length; i++) {
            if (i == 0) {
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