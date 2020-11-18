package Section2Algorithmization.ArraysOfArrays;
//6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class AOATask6 {
    public static void main(String[] args) {
        int p = 7;
        int [][] matrix = new int[p][p];

        System.out.println("Квадратная матрица:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < p; j++) {
                if ((i <= j) && (i <= p - 1 - j)) {
                    matrix[i][j] = 1;
                } else if ((i >= j) && (i >= p - 1 - j)) {
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
