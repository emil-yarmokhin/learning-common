public class BranchingTask1 {
    public static void main(String[] args) {
        int a, b;
        a = 20;
        b = 70;
        int c = 180 - (a + b);
        if (c == 90) {
            System.out.println("Такой треугольник существует, он будет прямоугольным.");
        } else if (c > 0) {
            System.out.println("Такой треугольник существует, но он не будет прямоугольным.");
        } else {
            System.out.println("Такого прямоугольника не существует.");
        }
    }
}
