package Branching;

public class BranchingTask1 {
    public static void main(String[] args) {
        System.out.print("1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, ");
        System.out.println("и если да, то будет ли он прямоугольным.");
        int a = 20;
        int b = 70;
        int c = 180 - (b + a);
        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            System.out.println("Такого треугольника не существует.");
            System.out.println("Величина угла в нём не может быть меньше нуля или больше 180 градусов включительно.");
            System.out.println("А если один из углов 0 градусов, то это уже и не треугольник.");
        } else if ((c == 90) || (a == 90) || (b == 90)) {
            System.out.println("Такой треугольник существует, он будет прямоугольным.");
        } else {
            System.out.println("Такой треугольник существует, но он не будет прямоугольным");
        }
    }
}
