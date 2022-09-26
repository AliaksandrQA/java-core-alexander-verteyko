package utils;

/**
 * В пакете utils создать класс Printer и создать в нем метод
 * - void printStars() который бы выводил в консоль звездочки вот таким образом, как на картинке
 * ниже.
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * <p>
 * В пакете utils создать класс Printer и создать в нем метод void checkNumbers(int x, int y, int z)
 * Должен выводить:
 * • Все три числа больше 0 - вывод “excellent”
 * • Два числа больше 0 - вывод “good”
 * • Одно число больше 0 - вывод “fine”
 * • Ни одного числа больше 0 - вывод “bad”
 */
public class Printer {
    public static void printStars() {
        int count = 6;
        for (int i = 0; i < count; i++) {

            for (int j = 0; j < i; j++)

                System.out.print("* ");

            System.out.println();
        }

    }

    public static void checkNumbers(int x, int y, int z) {
        if (x > 0 && y > 0 && z > 0) {
            System.out.println("Все три числа больше 0 - вывод “excellent”");
        } else if ((x > 0 && y > 0) || (x > 0 && z > 0) || (y > 0 && z > 0)) {
            System.out.println("Два числа больше 0 - вывод “good”");
        } else if (x > 0 || y > 0 || z > 0) {
            System.out.println("Одно число больше 0 - вывод “fine”");
        } else {
            System.out.println("Ни одного числа больше 0 - вывод “bad”");
        }
    }
}
