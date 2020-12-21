package Section2Algorithmization.DecompositionUsingMethods;

import java.util.Arrays;

/*13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
Для решения задачи использовать декомпозицию.*/
public class DUMTask13 {
    public static void main(String[] args) {
        int n = -50;
        int n2 = 19;
        int s = simpleDights(n, n2);
        if (ifNoPrimeNumbers(n, n2, s)) return;
        int[] a = new int[s];
        fillArray(a, n, n2);
        findingTwins(a);
    }

    private static boolean ifNoPrimeNumbers(int n, int n2, int s) {
        if (s == 0) {
            System.out.println("Нет ни одного простого числа в диапазоне от " + n + " до " + n2 + ".");
            return true;
        }
        return false;
    }

    public static int simpleDights(int n, int n2) {
        int count = 0;
        for (int k = n; k <= n2; k++) {
            boolean isPrime = true;
            for (int i = 2; i < k; i++) {
                if (k % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && k >= 2) {
                count++;
            }
        }
        return count;
    }

    public static void fillArray(int[] a, int n, int n2) {
        int j = 0;
        for (int k = n; k <= n2; k++) {
            boolean isPrime = true;
            for (int i = 2; i < k; i++) {
                if (k % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && k >= 2) {
                a[j] = k;
                j++;
            }
        }
        System.out.println("Простые числа от " + n + " до " + n2 + ":\n" + Arrays.toString(a));
    }

    public static void findingTwins(int[] a) {
        int count = 0;
        System.out.print("\nПары простых чисел-близнецов:\n");
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1] - 2) {
                count++;
                System.out.println(a[i] + " " + a[i + 1]);
            }
        }
        if (count == 0) {
            System.out.println("Нет ни одной пары простых чисел-близнецов.");
        }
    }
}