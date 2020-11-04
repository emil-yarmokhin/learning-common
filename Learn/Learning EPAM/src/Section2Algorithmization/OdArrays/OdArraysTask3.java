package Section2Algorithmization.OdArrays;
//3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
public class OdArraysTask3 {
    public static void main(String[] args) {
        int a = -20;
        int b = 30;
        int n = b - a;
        int otr = 0;
        int zer = 0;
        int pol = 0;
        int[] array = new int[n];
        for (int i = 0; i <= array.length; i++, a++) {
            i = a;
            if (i < 0) {
                otr++;
            } else if (i == 0) {
                zer++;
            } else if ((i > 0) && (i <= b)) {
                pol++;
            }
        }
        System.out.println("Отрицацельных элементов в массиве " + otr + ".");
        System.out.println("Нулевых элементов в массиве " + zer + ".");
        System.out.println("Положительных элементов в массиве " + pol + ".");
    }
}
/* Это как бы тоже работает, но я понимаю, что это полная хрень
int n = 2;
        int a = -20;
        int b = 30;
        int[] array = new int [Math.abs(b - a)];
        for (int i = a; i <= array.length - Math.abs(a); i++) {
            System.out.println(i);
        }
 */
