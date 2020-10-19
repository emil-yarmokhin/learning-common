public class LinearProgramsTask2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 5;
        double y = (b + (Math.sqrt((Math.pow(b, 2)) + (4 * a * c)))) / 2 * a - ((Math.pow(a, 3)) * c) + (Math.pow(b, -2));
        System.out.println(y);
    }
}
