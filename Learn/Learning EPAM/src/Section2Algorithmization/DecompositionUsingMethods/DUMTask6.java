package Section2Algorithmization.DecompositionUsingMethods;

import java.util.Random;

import static java.lang.Math.max;
/*6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.*/
public class DUMTask6 {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(13);
        int b = r.nextInt(13);
        int c = r.nextInt(13);
        int max1 = evklidAlgorithm(a, b);
        int max2 = evklidAlgorithm(b, c);
        definition(max1, max2, a, b, c);
    }

    public static void definition (int max1, int max2, int a, int b, int c) {
        if (evklidAlgorithm(max1, max2) != 1) {
            System.out.print("Числа " + a + " " + b + " " + c + " не являются взаимно простыми числами, ");
            System.out.println("их НОД больше 1 (" +  (evklidAlgorithm(max1, max2)) + ").");
        } else {
            System.out.print("Числа " + a + " " + b + " " + c + " являются взаимно простыми числами, ");
            System.out.println("их НОД равен " +  (evklidAlgorithm(max1, max2)) + ".");
        }
    }

    public static int evklidAlgorithm(int tempA, int tempB) {
        while (tempA != 0 && tempB != 0) {
            if (tempA > tempB) {
                tempA %= tempB;
            } else {
                tempB %= tempA;
            }
        }
        return max(tempA, tempB);
    }
}
