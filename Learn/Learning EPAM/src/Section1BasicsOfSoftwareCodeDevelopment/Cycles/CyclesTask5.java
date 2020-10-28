package Section1BasicsOfSoftwareCodeDevelopment.Cycles;

public class CyclesTask5 {
    public static void main(String[] args) {
        System.out.println("5. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.");
        int sum = 0;
        int[] array = new int[10];
        for (int i = 0; i <= array.length; i++) {
            sum += (i);
            System.out.println("Символу " + i + " соответствует численное обозначение " + sum + ".");
        }
    }
}
