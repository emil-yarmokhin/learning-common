//Найти сумму квадратов первых ста чисел.

package Cycles;

public class CyclesTask3 {
    public static void main(String[] args) {
        System.out.println("3. Найти сумму квадратов первых ста чисел.");
        int ssum = 0;
        int[] array = new int[100];
        for (int i = 1; i <= array.length; i++) {
            {
                ssum += (i*i);
            }
        }
        System.out.println(ssum);
    }
}