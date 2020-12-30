package Section2Algorithmization.DecompositionUsingMethods;

//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
public class DUMTask7 {
    public static void main(String[] args) {
        int start = 1;
        int end = 9;
        int a = range(start, end);
        System.out.println("Сумма факториалов всех нечётных чисел от " + start + " до " +  end + ": " + a);
    }

    private static int range(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            int g = sumCount(i);
            sum += g;
        }
        return sum;
    }

    private static int sumCount(int i) {
        int mult = 1;
        int sum = 0;
        for (int j = 1; j <= i; j++) {
            mult *= j;
        }
        if (i % 2 != 0) {
            sum += mult;
        }
        return sum;
    }
}