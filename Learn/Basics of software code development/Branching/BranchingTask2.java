package Branching;

public class BranchingTask2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int min1;
        int min2;
        int maxmin1min2;
        if (a < b) {
            min1 = a;
        } else {
            min1 = b;
        }
        if (c < d) {
            min2 = c;
        } else {
            min2 = d;
        }
        if (min1 > min2) {
            maxmin1min2 = min1;
        } else {
            maxmin1min2 = min2;
        }
        System.out.println(maxmin1min2);
    }
}