package Section2Algorithmization.DecompositionUsingMethods;

import java.util.Random;

/*8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].*/
public class DUMTask8 {
    public static void main(String[] args) {
        int n = 20;
        int[] d = new int[n];
        allParts(d);
        range(d);
    }

    private static void range(int[] d) {
        for (int i = 0; i < d.length - 2; i++) {
            sumCount(d, i);
        }
    }

    private static void sumCount(int[] d, int i) {
        int a = d[i];
        int b = d[i + 1];
        int c = d[i + 2];
        int sum = a + b + c;
        System.out.print("d[" + i + "] + d[" + (i + 1) + "] + d[" + (i + 2) + "] = ");
        System.out.println(a + " + " + b + " + " + c + " = " + sum);
    }

    private static void allParts(int[] d) {
        Random r = new Random();
        for (int i = 0; i < d.length; i++) {
            d[i] = r.nextInt(9) + 1;
            System.out.print(d[i] + " ");
        }
        System.out.println();
    }
}