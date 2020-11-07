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
            if (i > array[i]) {
                System.out.println("Число " + array[i] + " выводится на печать, оно меньше его индекса ai (" + i + ").");
            }
        }
        System.out.println("\n" + Arrays.toString(array));
    }
}