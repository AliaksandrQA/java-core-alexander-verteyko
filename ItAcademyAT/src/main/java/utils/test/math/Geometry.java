package utils.test.math;

/**
 * В пакете utils создать класс Geometry создать метод
 * - String getRoots(int a, int b, int c) – возвращает строку
 * «Корни квадратного уравнения a"  + a + " *x^2+ b" + b + " Значение *x+ c" + c + " = 0 равны x1 = + x1 + ",
 * x2 = + x2 + " - если корни квадратного уравнения есть
 * «Квадратное уравнение a Значение *x^2+ b Значение *x + c Значение = 0 не имеет корней»
 * ax^2 + bx + c = 0
 */

public class Geometry {
    public static String getRoots(int a, int b, int c) {
        double d = b * b - 4 * a * c;

        if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            return " Корни квадратного уравнения a" + a + " *x^2+ b" + b + " Значение *x+ c" + c + " = 0 равны x1 =" + x1 + x2 + " = + x2";
        } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        }

        return "Квадратное уравнение  a" + a + " *x^2+ b" + b;
    }

    public static double getHyp(int k1, int k2) {
        double hypotenuse = Math.sqrt(Math.pow(k1, 2) + Math.pow(k2, 2));

        return hypotenuse;
    }
}