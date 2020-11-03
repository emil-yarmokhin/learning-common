package Section1BasicsOfSoftwareCodeDevelopment.Cycles;

import java.math.BigInteger;

public class CyclesTask4 {
    public static void main(String[] args) {
        System.out.println("4. Составить программу нахождения произведения квадратов первых двухсот чисел.");
        BigInteger s = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
                s = s.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println(s);
    }
}