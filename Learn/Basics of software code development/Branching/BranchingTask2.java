public class BranchingTask2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        if (Math.min (a, b) > Math.min(c,d)) {
            System.out.println(Math.min(a, b));
        } else {
            System.out.println(Math.min(c, d));
        }
    }
}
