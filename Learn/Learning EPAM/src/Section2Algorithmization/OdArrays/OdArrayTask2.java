package Section2Algorithmization.OdArrays;
/*2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
Подсчи­тать количество замен. */
public class OdArrayTask2 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int z = 7;
        int akk = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] > z) {
                array[i] = z;
                akk++;
                }
            System.out.print(array[i] + " ");
            }
        System.out.println("\n" + akk);
    }
}
