package Section2Algorithmization.DecompositionUsingMethods;
/*16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
ИСПРАВЛЕНО: УБРАНЫ НЕНУЖНЫЕ СЧЁТЧИКИ (COUNT) */
public class DUMTask16 {
    public static void main(String[] args) {
        int n = 7;
        int a = (int) Math.pow(10, n - 1);//n-значное первое число
        int b = (int) Math.pow(10, n) - 1;//n-значное последнее число
        System.out.println("Все числа " + n + " порядка, содержащие только нечётные цифры:");
        getOddContainedOnly(a, b, n);
        System.out.println("\n\nСумма всех чисел " + n + " порядка, содержащих только нечётные цифры:\n" + range(a, b, n));
        System.out.println("\nКол-во чётных цифр в сумме всех чисел " + n + " порядка, содержащих только нечётные цифры:");
        System.out.println(getAllEvens(range(a, b, n)));
    }

    private static void getOddContainedOnly(int a, int b, int n) {//вывод на печать всех чисел порядка n, содержащих только нечётные цифры
        for (int i = a; i <= b; i++) {
            if (getAllOdds(i) == n) {
                System.out.print(i + " ");
            }
        }
    }

    private static long range(int a, int b, int n) {//суммирование всех чисел порядка n, содержащих только нечётные цифры
        long sum = 0;
        for (int i = a; i <= b; i++) {
            if (getAllOdds(i) == n) {
                sum += i;
            }
        }
        return sum;
    }

    private static int getAllOdds(long i) {//подсчёт всех нечётных цифр в числе
        int count = 0;
        while (i != 0) {
            if (i % 2 != 0) {
                count++;
            }
            i /= 10;
        }
        return count;
    }

    private static int getAllDigits(long i) {//подсчёт всех цифр в числе
        int count = 0;
        while (i != 0) {
            i /= 10;
            count++;
        }
        return count;
    }

    private static int getAllEvens(long i) {//подсчёт всех чётных цифр в числе
        return getAllDigits(i) - getAllOdds(i);
    }
}