package Section2Algorithmization.Sorting;

import java.util.Arrays;
//4. Реализуйте сортировку вставками.
public class SortingTask4 {
    public static void main(String[] args) {
        int[] array = {8, 5, 32, 12, 63, 74, 21, 88, 10, 2};
        System.out.println(Arrays.toString(array));

        for (int l = 0; l < array.length; l++) {// по очереди проходим по
            int value = array[l];// Перемещаемся по элементам, которые перед вытащенным элементом
            int i = l - 1;
            for (; i >= 0; i--) {// Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;//Если вытащенный элемент больше — останавливаемся
                }
            }
            array[i + 1] = value;// В освободившееся место вставляем вытащенное значение
        }
        System.out.println(Arrays.toString(array));
    }
}
