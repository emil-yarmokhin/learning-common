package Section2Algorithmization.ArraysOfArrays;
//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
public class AOATask1 {
    public static void main(String[] args) {
        int[][] matrix = {{77, 54, 16, 64, 35}, {48, 55, 16, 8, 11}, {7, 90, 9, 10, 25}, {90, 23, 34, 61, 15}, {12, 14, 54, 86, 95}};
        System.out.println("Исходная матрица:");
        for (int[] ints : matrix) {//внешний цикл, проходит по строкам
            for (int j = 0; j < ints.length; j++) {//внутренний цикл, по каждому из элементов в этой строке
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        System.out.println("Выведены все нечётные столбцы, у которых первый элемент больше последнего:");
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; j++) {
                if ((j % 2 != 0) && (matrix[0][j] > matrix[matrix.length - 1][j])) {
                    System.out.print(ints[j] + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();//после выполнения первым элементом внешнего массива над
            //всеми элементами внутреннего массива - перенос строки
        }
    }
}