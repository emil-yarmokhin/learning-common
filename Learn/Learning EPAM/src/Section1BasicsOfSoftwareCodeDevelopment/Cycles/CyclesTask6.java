/*6. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме
единицы и самого числа. m и n вводятся с клавиатуры*/

package Section1BasicsOfSoftwareCodeDevelopment.Cycles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CyclesTask6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите диапазон двух чисел для проверки с меньшего к большему через Enter.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        int dif = n - m;
        if (m < 0 || n < 0 || dif < 0) {
            System.out.println("\n" + "Число m должно быть меньше n, оба должны быть натуральными числами.");
            return;
        }
        for (int i = m; i <= n; i++) {
            System.out.println("\n" + "Все делители числа (кроме единицы и самого числа) " + i + ":");
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
        }
    }
}