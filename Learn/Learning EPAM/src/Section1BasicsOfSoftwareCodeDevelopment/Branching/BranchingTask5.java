package Section1BasicsOfSoftwareCodeDevelopment.Branching;

public class BranchingTask5 {
    public static void main(String[] args) {
        System.out.println("5. Вычислить значение функции:");
        double x = 3;
        double result;
        if (x > 3) {
            result = (1 / (x * x * x + 6));
        } else {
            result = (x * x - 3 * x + 9);
        }
            System.out.println(result);
    }
}