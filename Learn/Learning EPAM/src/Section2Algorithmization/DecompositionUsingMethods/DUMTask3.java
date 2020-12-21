package Section2Algorithmization.DecompositionUsingMethods;

import static java.lang.Math.*;

/*3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.*/
public class DUMTask3 {
    public static void main(String[] args) {
        int a = (int) (random() * 10 + 1);
        System.out.println("Площадь правильного шестиугольника со стороной a, равной " + a + ":\n" + hexagon(a));
    }

    public static double hexagon(int a) {
        return triangle(a) * 6;
    }

    public static double triangle(int a) {
        return ((pow(a, 2) * sqrt(3)) / 4);
    }
}