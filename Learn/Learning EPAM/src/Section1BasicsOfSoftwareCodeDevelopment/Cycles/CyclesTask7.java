package Section1BasicsOfSoftwareCodeDevelopment.Cycles;

public class CyclesTask7 {
    public static void main(String[] args) {
        System.out.println("7. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.");
        int a = 47454;
        int b = 74896;
        int x = b;
        while ((a != 0) || (b != 0)) {
            int c = a % 10;
            int d = b % 10;
            if (d == c)
                System.out.println(d + " ");
            b = b / 10;
            if ((b == 0) && (a != 0)) {
                a = a / 10;
                b = x;
            }
        }
    }
}