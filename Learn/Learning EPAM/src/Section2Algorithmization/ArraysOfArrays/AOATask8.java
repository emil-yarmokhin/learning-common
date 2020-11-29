package Section2Algorithmization.ArraysOfArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*8. В числовой матрице поменять местами два любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.*/
public class AOATask8 {
    public static void main(String[] args) throws IOException {
        int n = 5;
        System.out.println("Задайте через клавишу Enter два разных номера столбца от 0 до " + (n - 1));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//можно ведь только так?
        int j1 = Integer.parseInt(reader.readLine());
        int j2 = Integer.parseInt(reader.readLine());
        Random r = new Random();
        int[][] matrix = new int[n][n];
        if (j1 < 0 || j2 < 0 || j1 > n - 1 || j2 >  n - 1 || j1 == j2) {
            System.out.println("Ошибка. Введены два одинаковых номера столбца, или у матрицы нет таких столбцов.");
            return;
            //до этой строки пишем код, который исключает выполнение прораммы, если введённые пользователем параметры
            //выходят за пределы диапазона (количества столбцов)
        }
        System.out.println("Исходная матрица:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(100);
                System.out.format("%02d ", matrix[i][j]);
            }
            System.out.println();
        }

        int buf;//в этом блоке производим замену значений переменных в выбранных столбцах
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                buf = matrix[i][j1];
                matrix[i][j1] = matrix[i][j2];
                matrix[i][j2] = buf;
            }
        }

        //здесь мы уже окончательно всё выводим
        System.out.println("\nПользователем изменено местами положение столбцов: " + j1 + " и " + j2 + ".");
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.format("%02d ", ints[j]);
            }
            System.out.println();
        }

    }
}