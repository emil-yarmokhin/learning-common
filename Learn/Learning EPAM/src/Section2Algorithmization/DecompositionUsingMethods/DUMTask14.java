package Section2Algorithmization.DecompositionUsingMethods;

/*14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
Для решения задачи использовать декомпозицию.*/
public class DUMTask14 {
    public static void main(String[] args) {
        int k = 1000000;
        range(k);
    }

    private static void range(int k) {//проверка всех значений от 1 до k
        for (int i = 1; i <= k; i++) {
            if (i == armstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static int armstrong(int i) {//проверка на соответствие. Если да, выводится на печать
        int exponentNumber = exponent(i);
        return additionOfNumbersWithExponent(i, exponentNumber);
    }

    private static int additionOfNumbersWithExponent(int i, int exponentNumber) {//суммируем все цифры числа, возв. в степень
        int sum = 0;
        while (i != 0) {
            sum += (int) (Math.pow(i % 10, exponentNumber));
            i /= 10;
        }
        return sum;
    }

    private static int exponent(int i) {//поиск степени, в которую будут возводиться все цифры числа
        int exponentNumber = 0;
        while (i != 0) {
            i /= 10;
            exponentNumber++;
        }
        return exponentNumber;
    }
}