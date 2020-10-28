package Section1BasicsOfSoftwareCodeDevelopment.Branching;

public class BranchingTest4 {
    public static void main(String[] args) {
        System.out.print("4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.");
        System.out.println(" Определить, пройдет ли кирпич через отверстие.");
        int a = 5;
        int b = 4;
        int c = 10;
        int A = 4;
        int B = 5;
        boolean w = (((A >= a) && (A >= b)) || ((A >= a) && (A >= c)) || ((A >= b) && (A >= c)));
        boolean x = (((B >= a) && (B >= b)) || ((B >= a) && (B >= c)) || ((B >= b) && (B >= c)));
        boolean y = (((A >= a) || (A >= b)) || ((A >= a) || (A >= c)) || ((A >= b) || (A >= c)));
        boolean z = (((B >= a) || (B >= b)) || ((B >= a) || (B >= c)) || ((B >= b) || (B >= c)));
        if ((w && z) || (x && y)) {
        System.out.println("Кирпич пройдёт");
        } else {
            System.out.println("Кирпич не пройдёт");
        }
    }
}