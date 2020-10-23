package LinearPrograms;

public class LinearProgramsTask5 {
    public static void main(String[] args) {
        int t = 3866;
        int hr = (t / 3600);
        int min = (t % 3600) / 60;
        int sec = (t % 3600) % 60;
        System.out.printf("%02d" + "ч " + "%02d" + "мин " + "%02d" + "c", hr, min, sec);
    }
}
