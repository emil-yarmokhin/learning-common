public class LinearProgramsTask5 {
    public static void main(String[] args) {
        int T = 3866;
        int hr = (T / 3600);
        int min = (T % 3600) / 60;
        int sec = (T % 3600) % 60;
        System.out.printf("%02d", hr);
        System.out.printf("ч " + "%02d", min);
        System.out.printf("мин " + "%02d", sec);
        System.out.println("с");
        //
    }
}
