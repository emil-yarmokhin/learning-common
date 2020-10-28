package LinearPrograms;

public class LinearProgramsTask4 {
    public static void main(String[] args) {
        System.out.print("4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).");
        System.out.println(" Поменять местами дробную и целую части числа и вывести полученное значение числа.");
        double R = 222.333;
        int a1 = (int) R;
        double b1 = (R - (double) a1) * 1000;
        double R1 = b1 + ((double) a1 / 1000);
        System.out.printf("%.3f", R1);
    }
}