package Section2Algorithmization.OdArrays;

import java.util.Arrays;
import java.util.Random;

//5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
public class OdArraysTask5 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 15;
        int [] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
        }
        System.out.println("Приведённый массив:");
        System.out.println(Arrays.toString(array));
        System.out.println("На печать выводятся элементы, чьи индексы численно выше их:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < i) {
                System.out.println("Элемент " + array[i] + " с индексом " + i + ".");
            }
        }
    }
}