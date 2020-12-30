package Section2Algorithmization.DecompositionUsingMethods;
/*15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
(например, 1234, 5789). Для решения задачи использовать декомпозицию.*/
public class DUMTask15 {
    public static void main(String[] args) {
        int n = 9;
        int a = (int) Math.pow(10, n - 1);//n-значное первое число
        int b = (int) Math.pow(10, n) - 1;//n-значное последнее число
        if (exception(n)) return;//если ввести меньше n или равно 1 / больше или равно 10
        increasingSequence(a, b);
    }

    private static boolean exception(int n) {//исключение, завершение программы, если значение true
        if (n <= 0 || n >= 10) {
            System.out.println("Значение n может быть от 1 до 9");
            return true;
        }
        return false;
    }

    private static void increasingSequence(int a, int b) {//вывод на экран чисел строго-возрастающей послед-сти
        for (int i = a; i <= b; i++) {
            ifTheSameNumCharge(i);
        }
    }

    private static void ifTheSameNumCharge(int i) {//вывод на печать чисел, соответствующих условию
        int p = i;
        while (p >= 0) {
            if (p % 10 > p / 10 % 10) {
                p /= 10;
            } else if (p == 0) {
                System.out.print(i + " ");
                break;
            } else {
                break;
            }
        }
    }
}