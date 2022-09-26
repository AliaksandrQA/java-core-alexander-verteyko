package utils;
import java.util.Random;

/**
 * В пакете utils создать класс RandomData создать метод generateArray() возвращающий
 * одномерный массив int содержащий 100 элементов заполняющийся случайными числами
 * (использовать java.util.Random().nextInt()).
 */
public class RandomData {
    public static int[] generateArray() {
        Random random = new Random();

        int[] arrayRandom = new int[100];

        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = random.nextInt(100);
        }
        return arrayRandom;

    }
}
