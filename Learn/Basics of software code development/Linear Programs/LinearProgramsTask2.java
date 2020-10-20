package LinearPrograms;

import static java.lang.Math.sqrt;

public class LinearProgramsTask2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 5;
        double y = b + (sqrt(b * b + (4.0 * a * c)));
        double x = (a * a * a * c);
        double z = 1.0 / (b * b);
        double res = y/(2.0 * a) - x + z;
        System.out.println(res);
    }
}