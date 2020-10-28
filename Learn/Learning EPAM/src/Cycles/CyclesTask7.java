package Cycles;

public class CyclesTask7 {
    public static void main(String[] args) {
        System.out.println("7. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.");
        int[] array = new int[10];
        int a = 56278;
        while (a != 0) {
            array[a % 10]++;
            a /= 10;
        }
        int b = 5498327;
        while (b != 0) {
            if (array[b % 10] != 0)
                System.out.print(b % 10 + " ");
            b /= 10;
        }
    }
}