package Section1BasicsOfSoftwareCodeDevelopment.LinearPrograms;

public class LinearProgramsTask5 {
    public static void main(String[] args) {
        System.out.print("5. Дано натуральное число Т, которое представляет длительность прошедшего времени в");
        System.out.println(" секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей форме:");
        int t = 3866;
        int hr = (t / 3600);
        int min = (t % 3600) / 60;
        int sec = (t % 3600) % 60;
        System.out.printf("%02d" + "ч " + "%02d" + "мин " + "%02d" + "c", hr, min, sec);
    }
}
