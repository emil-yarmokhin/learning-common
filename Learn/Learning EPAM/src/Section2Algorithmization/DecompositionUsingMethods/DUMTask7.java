package Section2Algorithmization.DecompositionUsingMethods;

//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
public class DUMTask7 {
    public static void main(String[] args) {
        int start = 1;
        int end = 9;
        int global = calculations(start, end);
        System.out.println(global);
    }

    public static int calculations(int a, int b) {
        int global = 0;
        int count = 1;
        for (int i = a; i <= b; i++) {
            for (int j = a; j <= b; j++) {
                boolean odds = i % 2 != 0;
                if (i > j && odds) {
                    count *= j;
                } else if (i == j && odds) {
                    count *= j;
                    global += count;
                    count = 1;
                }
            }
        }
        return global;
    }
}