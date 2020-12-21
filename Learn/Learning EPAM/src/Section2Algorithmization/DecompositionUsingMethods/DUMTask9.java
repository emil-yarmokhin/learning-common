package Section2Algorithmization.DecompositionUsingMethods;

import java.util.Random;

import static java.lang.Math.*;
import static java.lang.Math.sqrt;

/*9. Даны числа X, Y, Z, Т — длины сторон четырехугольника.
Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.*/
public class DUMTask9 {
    public static void main(String[] args) {
        Random r = new Random();
        int X = r.nextInt(10) + 1;
        int Y = r.nextInt(10) + 1;
        int Z = r.nextInt(10) + 1;
        int T = (int) sideTlength(X, Y, Z);/*длина стороны T всегда меньше суммы стороны Z и диагонали XY*/
        System.out.println(quadrangleSquare(X, Y, Z, T));
    }

    public static double sideTlength(int s1, int s2, int s3) {//нахождение четвёртой стороны четырёхугольника
        double pifagor = sqrt(pow(s1, 2) + pow(s2, 2));
        /*метод в 21 строке создаёт рандомное значение в указанном диапазоне для переменной T в методе main*/
        int min = (int) (abs(pifagor - s3) + 1);
        int max = (int) (abs(pifagor + s3) - 1);
        return random() * (max - min + 1) + min;
    }

    public static double quadrangleSquare(int s1, int s2, int s3, int s4) {//дальнейшая декомпозиция метода нецелесообразна
        double pifagor = sqrt(pow(s1, 2) + pow(s2, 2));//если X и Y - катеты, XY - гипотенуза, находится по формуле Пифагора
        double rectangular = 0.5 * s1 * s2;//площадь прямоугольного треугольника
        double semiPerimeter = 0.5 * (s3 + s4 + pifagor);//31 и 32 строка - формула Герона (полупериметр)
        double geron = sqrt(semiPerimeter * (semiPerimeter - s3) * (semiPerimeter - s4) * (semiPerimeter - pifagor));
        final double s = rectangular + geron;//сложение двух треугольников даёт площадь четырёхугольника
        System.out.print("Длина сторон четырёхугольника с прямым углом между сторонами X и Y: \nX: ");
        System.out.print(s1 + "\nY: " + s2 + "\nZ: " + s3 + "\nT: " + s4 + "\nПлощадь четырёхугольника: \n");
        return s;
    }
}