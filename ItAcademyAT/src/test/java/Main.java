import phone.Phone;

import java.util.Arrays;

import static utils.Calculate.*;
import static utils.Check.*;
import static utils.Printer.*;
import static utils.test.math.Geometry.*;
import static utils.MyTime.getTimeInHoursMinutesSeconds;
import static utils.RandomData.generateArray;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(generateArray()));

        boolean isOdd = isOdd(33);
        System.out.println(isOdd);

        boolean isDividedOnThree = isDivided(699);
        System.out.println(isDividedOnThree);

        boolean isDividedOnFiveAndSeven = isDividedByFiveAndSeven(310);
        System.out.println(isDividedOnFiveAndSeven);

        int[] arr = {1, 2, 66, 88, 99, 32};
        int max = getMax(arr);
        System.out.println(max);
        int min = getMin(arr);
        System.out.println(min);
        int sumOfArrayElements = getSumOfArrayElements(arr);
        System.out.println(sumOfArrayElements);

        System.out.println( "Среднее значение: " + getAverage(2, 3, 5));

        String myHoursSet = getTimeInHoursMinutesSeconds(5);
        System.out.println(myHoursSet);

        String roots = getRoots(2, 3, 4);
        System.out.println(roots);

        double hypotenuse = getHyp(2, 12);
        System.out.println("Гипотенуза =" + hypotenuse);

        printStars();

        checkNumbers(0, 0, 0);

        Phone iphone13Pro = new Phone("+8700500800 ", "Pro", 100);
        Phone iphone13Mini = new Phone("123", "Mini", 100);
        Phone iphone13ProMax = new Phone();

        iphone13ProMax.setNumber("+4958904000");
        iphone13ProMax.setModel("Pro Max");
        iphone13ProMax.setWeight(104);

        iphone13Pro.receiveCall("John Wick");

        iphone13Mini.receiveCall("+4810600230 ", "Big brother is calling");

        iphone13Pro.sendMessage(123, 234, 456, 78678);

    }

}
