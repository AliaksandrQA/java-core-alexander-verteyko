package utils;

/**
 * В пакете utils создать класс MyTime создать метод:
 * - String getTimeInHoursMinutesSeconds(int timeSeconds) переводить секунды в форматированный
 * вид - часы минуты секунды учитывая окончания слов
 * Пример:
 * 1249
 * 20 минут 49 секунд
 * 648958
 * 180 часов 15 минут 58 секунд
 */
public class MyTime {
    // час 1 21
    // часа 2 3 4 22 23 24
    // часов 5 6 7 8 9 10
    // -------------------
    // минута 1 21
    // минуты 2 3 4 22
    // минут 5 6 7 8 9 10 20
    // -------------------
    // секунд 5 6 7 8 9 10
    // секунда 1 21
    // секунды 2 3 4

    public static String getTimeInHoursMinutesSeconds(int timeSeconds) {
        long hour = timeSeconds / 3600;
        if (hour != 0) {
            if (hour % 10 == 1) {
                System.out.print(hour + " час ");
            } else if (hour % 10 == 2 || hour % 10 == 3 || hour % 10 == 4) {
                System.out.print(hour + " часа ");
            } else {
                System.out.print(hour + " часов ");
            }
        }


        long min = timeSeconds / 60 % 60;
        if (min != 0) {
            if (min % 10 == 1) {
                System.out.print(hour + " минута ");
            } else if (min % 10 == 2 || min % 10 == 3 || min % 10 == 4) {
                System.out.print(min + " минуты ");
            } else {
                System.out.print(min + " минут ");
            }
        }

        long sec = timeSeconds % 60;
        if (sec != 0) {
            if (sec % 10 == 1) {
                System.out.println(sec + " секунда");
            } else if (sec % 10 == 2 || sec % 10 == 3 || sec % 10 == 4) {
                System.out.println(sec + " секунды");
            } else {
                System.out.println(sec + " секунд");
            }
        }
        return String.format("%02d:%02d:%02d", hour, min, sec);
    }
}
