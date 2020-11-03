//Найти сумму квадратов первых ста чисел.

package Section1BasicsOfSoftwareCodeDevelopment.Cycles;

public class CyclesTask3 {
    public static void main(String[] args) {
        System.out.println("3. Найти сумму квадратов первых ста чисел.");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i*i;
        }
        System.out.println(sum);
    }
}