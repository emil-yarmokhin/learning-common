package Section2Algorithmization.DecompositionUsingMethods;

import static java.lang.Math.*;
/*1. Написать метод(методы) для нахождения наибольшего общего делителя
и наименьшего общего кратного двух натуральных чисел: НОК(A, B) = (A*B)/НОД(A,B)*/
//КОММЕНТАРИЙ К ЗАДАЧЕ: ВНАЧАЛЕ Я ХОТЕЛ ВРУЧНУЮ РАСПИСАТЬ, КАК НАХОДИТЬ НОД, НО РЕШИЛ ПРИБЕГНУТЬ К АЛГОРИТМУ ЕВКЛИДА,
//ПОТОМУ ЧТО ЭТО РАЦИОНАЛЬНО. СРАВНИВАЕТСЯ ПАРА ЧИСЕЛ, ПОСЛЕ БОЛЬШЕЕ ДЕЛИТСЯ НА МЕНЬШЕЕ. ЕСЛИ ЕСТЬ ОСТАТОК,
//ПЕРЕМЕННОЙ С БОЛЬШИМ ЧИСЛОМ ПРИСВАИВАЕТСЯ ЗНАЧЕНИЕ ОСТАТКА. ЦИКЛ ПОВТОРЯЕТСЯ ВНОВЬ, ПОКА В ВЫЧИСЛЕНИЯХ ОСТАТОК != 0.
//ПОСЛЕДНИЙ ОСТАТОК - НОД.
public class DUMTask1 {
    public static void main(String[] args) {
        int a = 132;
        int b = 36;
        int nod = evklidAlgorithm(abs(a), abs(b));
        int nok = a * b / nod;
        System.out.println("НОД (" + a + ", " + b + "): " + nod);
        System.out.println("НОК (" + a + ", " + b + "): " + nok);
    }

    public static int evklidAlgorithm(int tempA, int tempB) {
        while (tempA != 0 && tempB != 0) {
            if (tempA > tempB) {
                tempA %= tempB;
            } else {
                tempB %= tempA;
            }
        }
        return max(tempA, tempB);//значение, не являющееся нулевым - НОД двух чисел
    }
}