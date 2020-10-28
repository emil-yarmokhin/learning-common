package Cycles;

public class CyclesTask6 {
    public static void main(String[] args) {
        System.out.print("6. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме ");
        System.out.println("единицы и самого числа. m и n вводятся с клавиатуры.");
        int m = 12;
        int n = 32;
        int sum = n - m;
        int[] array = new int[sum];
        for (int i = 0; i <= array.length; i++) {
            int r = i + m;
            System.out.println("\n" + "Все делители числа (кроме единицы и самого числа) " + r + ":");
            int j = 2;
            while ((r >= 4) && (j < r)) {
                if (((r % j == 0)) && (j < (r / 2))) {
                    System.out.print(j + " ");
                } else if (((r % j == 0)) && (j >= (r / 2))) {
                    System.out.print(j);
                }
                j++;
            }
        }
    }
}