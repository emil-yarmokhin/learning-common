package LinearPrograms;

public class LinearProgramsTask6 {
    public static void main(String[] args) {
        System.out.print("6. Для данной области составить линейную программу, которая печатает true, если точка с ");
        System.out.println("координатами (х, у) принадлежит закрашенной области, и false — в противном случае:");
        int a = 0;
        int b = -1;
        boolean x = ((a >= -4) && (a <= 4) && (b >= -3) && (b <= 0));
        boolean y = ((a >= -2) && (a <= 2) && (b >= 0) && (b <= 4));
        if (x || y) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}