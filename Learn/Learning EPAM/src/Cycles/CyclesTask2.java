package Cycles;

public class CyclesTask2 {
    public static void main(String[] args) {
        System.out.print("2. Вычислить значения функции на отрезке [а,b] c шагом h");
        System.out.println(": http://comp-science.narod.ru/executants/images/vich/vca1.jpg");
        int a = 7;
        int b = 1;
        int h = 2;
        for (int i = a; i >= b; i -= h) {
            int y = i;
            if (i <= 2) {
                y = (-i);
            }
            System.out.println("При х = " + i + " у = " + y);
        }
    }
}