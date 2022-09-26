package utils;

/**
В пакете utils создать класс Calculate и создать методы:
- int getMax(int[] nums) возвращающий наибольшее значение из элементов массива
- int getMin(int[] nums) возвращающий наименьшее значение из элементов массива
- int getSumOfArrayElements(int[] nums) возвращает сумму элементов массива
- double getAverage(int a, int b, int c) возвращает среднее значение для тех чисел
 */
public class Calculate {

    public static int getMax(int[] nums) {
        int maxValue = nums[0];
        for (int i = 1; i < nums.length; i++) { // why do we start from 1st element
            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] nums) {
        int minValue = nums[0];
        for (int i = 1; i < nums.length; i++) { // why do we start from 1st element
            if (nums[i] < minValue) {
                minValue = nums[i];
            }
        }
        return minValue;
    }

    public static int getSumOfArrayElements(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;

        }
        return sum;
    }

    public static double getAverage(int a, int b, int c) {
        double sum = a + b + c;
        return sum / 3;
    }
}
