package LinearPrograms;

import static java.lang.Math.abs;

public class LinearProgramsTask2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 5;
        double y = (b * b + (4.0 * a * c));
        double EPSILON = 1e-15;
        double t = y;
        while (abs(t - y / t) > EPSILON * t)
            t = (y / t + t) / 2.0;
            double x = (a * a * a * c);
            double z = 1.0 / (b * b);
            double res = (b + t) / (2.0 * a) - x + z;
            System.out.println(res);
    }
}