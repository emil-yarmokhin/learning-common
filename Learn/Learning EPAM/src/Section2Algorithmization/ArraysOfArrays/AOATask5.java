package Section2Algorithmization.ArraysOfArrays;
//5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class AOATask5 {
    public static void main(String[] args) {
        int p = 6;
        int [][] matrix = new int[p][p];

        System.out.print("В сформированной матрице все элементы самой верхней строки имеют значение, равное i + 1, ");
        System.out.println("в последующих - нулями заменяются последние элементы строк. Кол-во замен равно i:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < p; j++) {
                if (i <= p - 1 - j) {
                    matrix[i][j] = i + 1;
                }
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
