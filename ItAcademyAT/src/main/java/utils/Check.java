package utils;

/**
 * В пакете utils создать класс Check и создать методы:
 * - boolean isOdd(int a) возвращающий true если число четное, иначе false
 * - boolean isDividedByThree(int a) возвращающий true если число делиться на 3, иначе false
 * - boolean isDividedByFiveAndSeven(int a) возвращающий true емсли число делиться и на 5 и на 7
 */

public class Check {
    public static boolean isOdd(int a) {
        return a % 2 == 0;
    }

    public static boolean isDivided(int a) {
        return a % 3 == 0;
    }

    public static boolean isDividedByFiveAndSeven(int a) {
        return a % 5 == 0 && a % 7 == 0;
    }
}