package Section2Algorithmization.DecompositionUsingMethods;

import java.util.Arrays;

/*10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.*/
public class DUMTask10 {
    public static void main(String[] args) {
        int number = 749556;
        int[] array = new int[countDigits(number)];
        fillArray(number, array);//вызов метода, который заполняет массив
        System.out.println(Arrays.toString(array));
    }

    public static int countDigits(int number) {//этот метод считает кол-во цифр в числе n
        int count = 0;
        int n = number;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void fillArray(int number, int[] array) {//этот метод вызывает массив, заполняет его
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = number % 10;
            number = number / 10;
        }
    }
}