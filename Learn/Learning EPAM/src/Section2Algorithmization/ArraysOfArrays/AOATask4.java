package Section2Algorithmization.ArraysOfArrays;
//4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class AOATask4 {
    public static void main(String[] args) {
        int p = 6;
        int [][] matrix = new int[p][p];

        System.out.print("Образец подразумевал создание матрицы порядка, где чётные строки начинаются с 1, заканчиваются");
        System.out.println(" чётным числом, а нечётные строки матрицы - наоборот.");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < p; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = p - j;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
