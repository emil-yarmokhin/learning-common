/*Напишите программу, где пользователь вводит любое целое положительное число.
    А программа суммирует все числа от 1 до введенного пользователем числа.*/

package Section1BasicsOfSoftwareCodeDevelopment.Cycles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CyclesTask1 {
    public static void main(String[] args) throws Exception {
        int a;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(reader.readLine());
        if (a >= 0) {
            int sum = 0;
            for (int i = 0; i <= a; i++) {
                sum += i;
            }
            a = sum;
            System.out.println("Сумма всех чисел от 1 до введённого числа равна " + a);
        } else {
            System.out.println("Вы ввели что-то, но точно не число от 1");
        }
    }
}