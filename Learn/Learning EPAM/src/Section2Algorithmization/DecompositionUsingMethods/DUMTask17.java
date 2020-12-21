package Section2Algorithmization.DecompositionUsingMethods;
/*17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.*/
public class DUMTask17 {
    public static void main(String[] args) {
        int k = 21;
        amountOfCycles(k);//вызов метода amountOfCycles. Именно столько действий нужно произвести, чтобы получ. нуль.
    }

    private static void amountOfCycles(int k) {//метод счётчика циклов
        int count = 0;
        count = cycle(k, count);
        System.out.println(count);
    }

    private static int cycle(int k, int count) {//вычитание из числа k суммы всех его цифр, запуск счётчика
        while (k != 0) {
            count++;
            int sum = getSum(k);
            k -= sum;
        }
        return count;
    }

    private static int getSum(int k) {//значение, получающееся после сложения всех цифр числа k
        int sum = 0;
        int d = k;
        while (d != 0) {
            sum += d % 10;
            d /= 10;
        }
        return sum;
    }
}