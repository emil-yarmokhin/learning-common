package Section1BasicsOfSoftwareCodeDevelopment.Cycles;

import java.math.BigInteger;

public class CyclesTask4 {
    public static void main(String[] args) {
        System.out.println("4. Составить программу нахождения произведения квадратов первых двухсот чисел.");
        BigInteger s = BigInteger.valueOf(1);
        int[] array = new int[200];
        for (int i = 1; i <= array.length; i++) {
            {
                s = s.multiply(BigInteger.valueOf((long) i * i));
            }
        }
    }
}