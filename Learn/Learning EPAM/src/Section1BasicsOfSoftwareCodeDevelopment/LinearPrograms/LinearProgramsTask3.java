package Section1BasicsOfSoftwareCodeDevelopment.LinearPrograms;

import static java.lang.Math.*;

public class LinearProgramsTask3 {
    public static void main(String[] args) {
        System.out.println("3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):");
        double degrees_x = 30.0;
        double degrees_y = 45.0;
        double x = ((sin(degrees_x) + cos(degrees_y))
                / (cos(degrees_x) - sin(degrees_y)))
                * (tan(degrees_x * degrees_y));
        System.out.println(x);
    }
}
