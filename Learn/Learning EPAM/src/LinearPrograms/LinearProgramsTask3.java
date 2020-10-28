package LinearPrograms;

public class LinearProgramsTask3 {
    public static void main(String[] args) {
        System.out.println("3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):");
        double degrees_x = 30.0;
        double degrees_y = 45.0;
        double x = ((Math.sin(degrees_x) + Math.cos(degrees_y))
                / (Math.cos(degrees_x) - Math.sin(degrees_y)))
                * (Math.tan(degrees_x * degrees_y));
        System.out.println(x);
    }
}
