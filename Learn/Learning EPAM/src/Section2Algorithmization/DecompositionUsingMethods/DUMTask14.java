package Section2Algorithmization.DecompositionUsingMethods;

/*14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
Для решения задачи использовать декомпозицию.*/
public class DUMTask14 {
    public static void main(String[] args) {
        int k = 10000000;
        armstrong(k);
    }

    private static void armstrong(int k) {//нахождение числа Армстронга
        for (int i = 1; i <= k; i++) {
            int count = 0;
            int countExp = exponent(i);
            count = isArmstrong(i, count, countExp);
            if (count == i) {
                System.out.print(count + " ");
            }
        }
    }

    private static int isArmstrong(int i, int count, int countExp) {//проверка, явл. ли число числом Армстронга
        int g = i;
        while (g != 0) {
            count += (int) (Math.pow(g % 10, countExp));
            g /= 10;
        }
        return count;
    }

    private static int exponent(int i) {//определение степени, в которую возводятся цифры числа и суммируются
        int s = i;
        int countExp = 0;
        while (s != 0) {
            s = s / 10;
            countExp++;
        }
        return countExp;
    }
}