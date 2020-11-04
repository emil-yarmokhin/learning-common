package Section2Algorithmization.OdArrays;
// 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
public class OdArraysTask1 {
    public static void main(String[] args) {
        int a = 4;
        int sum = 0;
        int [] array = new int [12];
        for (int i = 1; i <= array.length; i++) {
            if (i % a == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
