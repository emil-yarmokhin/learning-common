package Section2Algorithmization.DecompositionUsingMethods;
/*15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
(например, 1234, 5789). Для решения задачи использовать декомпозицию.*/
public class DUMTask15 {
    public static void main(String[] args) {
        int n = 6;
        int a = (int) Math.pow(10, n - 1);//n-значное первое число
        int b = (int) Math.pow(10, n) - 1;//n-значное последнее число
        increasingSequence(n, a, b);
    }

    private static void increasingSequence(int n, int a, int b) {//вывод на экран чисел строго-возрастающей послед-сти
        if0andLessOr10andMore(n);//если ввести меньше n или равно 1 / больше или равно 10
        for (int i = a; i <= b; i++) {
            int count = 1;
            ifTheSameNumCharge(n, i, count);
        }
    }

    private static void ifTheSameNumCharge(int n, int i, int count) {//нахождение чисел, соответствующих условию
        while (count <= Math.pow(10, n)) {
            if (i / count % 10 > i / (count * 10) % 10) {
                count *= 10;
            } else {
                break;
            } if (count == Math.pow(10, n)) {//если count имеет столько же разрядов, сколько число i, то оно подходит
                System.out.print(i + " ");
            }
        }
    }

    private static void if0andLessOr10andMore(int n) {//вывод предупреждения в случае ввода неверного значения
        if (n <= 0 || n >= 10) {
            System.out.println("Значение n может быть от 1 до 9");
        }
    }
}