/*Напишите программу, где пользователь вводит любое целое положительное число.
    А программа суммирует все числа от 1 до введенного пользователем числа.*/

package Cycles;

public class CyclesTask1 {
    public static void main(String[] args) {
        System.out.println("1. Напишите программу, где пользователь вводит любое целое положительное число.");
        System.out.println(" А программа суммирует все числа от 1 до введенного пользователем числа.");
        int sum = 0;
        int a = Integer.parseInt(args[0]);
        int[] array = new int[a];
        for (int i = 0; i <= array.length; i++) {
            sum += (i);
        }
        System.out.print(sum);
    }
}