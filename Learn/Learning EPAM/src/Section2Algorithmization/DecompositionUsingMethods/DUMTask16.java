package Section2Algorithmization.DecompositionUsingMethods;
/*16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.*/
public class DUMTask16 {
    public static void main(String[] args) {
        int n = 4;
        int a = (int) Math.pow(10, n - 1);//n-значное первое число
        int b = (int) Math.pow(10, n) - 1;//n-значное последнее число
        long sum = oddOnly(n, a, b);
        System.out.println("\nСумма всех чисел n-ного порядка, содержащих только нечётные цифры, равна: " + sum);
        System.out.println("Количество чётных цифр в найденной сумме: " + even(sum));
    }

    private static long even (long sum) {//счётчик чётных чисел суммы чисел, содержащих только нечётные цифры
        int evenCount = 0;
        while (sum != 0) {
            if (sum % 2 == 0) {
            evenCount++;
            }
            sum /= 10;
        }
        return evenCount;
    }

    private static long oddOnly(int n, int a, int b) {//счётчик чисел, состоящие полностью из нечётных цифр
        long sum = 0;
        for (int i = a; i <= b; i++) {
            sum = getSum(n, sum, i);
        }
        return sum;
    }

    private static long getSum(int n, long sum, int i) {//нахождение чисел, состоящие полностью из нечётных цифр
        int count = 1;
        int p = i;
        while (count <= Math.pow(10, n)) {
            if (p % 2 != 0) {
                p /= 10;
                count *= 10;
            } else {
                break;
            }
            sum = getSum(n, sum, i, count);
        }
        return sum;
    }

    private static long getSum(int n, long sum, int i, int count) {
        if (count == Math.pow(10, n)) {//если count имеет столько же разрядов, сколько число i, то оно подходит
            sum += i;
            System.out.print(i + " ");
        }
        return sum;
    }
}
