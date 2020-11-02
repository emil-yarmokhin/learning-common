package Section1BasicsOfSoftwareCodeDevelopment.Cycles;

public class CyclesTask5 {
    public static void main(String[] args) {
        System.out.println("5. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.0-255");
        char a = 0;
        for (int i = 0; i <= 255; i++, a++) {
            System.out.println("Символу " + i + " соответствует численное обозначение " + a + ".");
        }
    }
}
