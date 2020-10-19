public class BranchingTask3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = a / b;
        while (a<=3) {
            a++;
        }
        while (b<=3) {
            b++;
        }
        if ((a / b) == c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
