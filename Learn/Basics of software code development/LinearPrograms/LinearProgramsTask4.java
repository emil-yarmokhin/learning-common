package LinearPrograms;

public class LinearProgramsTask4 {
    public static void main(String[] args) {
        double R = 222.333;
        int a1 = (int) R;
        double b1 = (R - (double) a1) * 1000;
        double R1 = b1 + ((double) a1 / 1000);
        System.out.printf("%.3f", R1);
    }
}