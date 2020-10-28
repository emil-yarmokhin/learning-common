package Section1BasicsOfSoftwareCodeDevelopment.Branching;

public class BranchingTask3 {
    public static void main(String[] args) {
        System.out.print("3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).");
        System.out.println(" Определить, будут ли они расположены на одной прямой.");
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 2;
        int x3 = 3;
        int y3 = 3;
        int t = 1;
        int l1 = x2 - x1;
        int l2 = x3 - x2;
        int m1 = y2 - y1;
        int m2 = y3 - y2;
        double x = (l1 * t + x1);
        double y = (m1 * t + y1);
        double xx = (l2 * t + x2);
        double yy = (m2 * t + y2);
        if ((yy / xx) == (y / x)) {
            System.out.print("Да, точки A, B, C находятся на одной прямой. Доказано через");
            System.out.println(" через параметрическое уравнение прямой.");
        } else {
            System.out.println("Нет. В точке B образуется угол.");
        }
    }
}
