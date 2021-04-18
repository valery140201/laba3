/**
 * @autor Бокша Валерия
 * 3 курс, 61 группа
 * @version 1.0
 *  Класс, засекающий время выполнения методов некоторое количество раз
 */

import java.util.Date;
import java.util.List;

public class Stopwatch {

    /** Поле количества элементов списка */
    static int m = 100000;

    /** Максимальное значение случайного числа */
    static int k = 100;

    /**
     * @return случайное число
     */
    static int getRandomNumber() {
        return (int) ((Math.random() * k));
    }

    /**
     * Выводит время выполнения .add - метода в консоль
     * для заданного типа списка
     * для определенного количества циклов
     */

    static void additionTime(List<Integer> list) {

        String tmp;
        Date startTime = new Date();

        for (int i = 0; i < m; i++) {
            list.add(getRandomNumber());
        }

        Date finishTime = new Date();
        long finalTime = finishTime.getTime() - startTime.getTime();
        if (list.getClass().getName() == "java.util.LinkedList")
            tmp = "LinkedList";
        else tmp = "ArrayList";
        System.out.println(".add time for " + tmp + "(" + m + " cases) = " + finalTime + "ms");
    }
    /**
     * Выводит время выполнения .get - метода в консоль
     * для заданного типа списка
     * для определенного количества циклов
     * с конца списка
     */
    static void gettingTimeEnd(List<Integer> list) {

        String tmp;
        Date startTime = new Date();

        for (int i = m - 1; i > m / 2; i--) {
            list.get(i);
        }

        Date finishTime = new Date();
        long finalTime = finishTime.getTime() - startTime.getTime();
        if (list.getClass().getName() == "java.util.LinkedList")
            tmp = "LinkedList";
        else tmp = "ArrayList";
        System.out.println(".get time from the end for " + tmp + "(" + m/2 + " cases) = " + finalTime + "ms");
    }


    /**
     * Выводит время выполнения .get - метода в консоль
     * для заданного типа списка
     * для определенного количества циклов
     * с середины списка
     */
    static void gettingTimeMid(List<Integer> list) {

        String tmp;
        Date startTime = new Date();

        for (int i = m / 4; i < m / 2; i++) {
            list.get(i);
        }

        Date finishTime = new Date();
        long finalTime = finishTime.getTime() - startTime.getTime();
        if (list.getClass().getName() == "java.util.LinkedList")
            tmp = "LinkedList";
        else tmp = "ArrayList";
        System.out.println(".get time from the middle for " + tmp + "(" + m/4 + " cases) = " + finalTime + "ms");
    }

    /**
     * Выводит время выполнения .get - метода в консоль
     * для заданного типа списка
     * для определенного количества циклов
     * с начала списка
     */
    static void gettingTimeBegin(List<Integer> list) {

        String tmp;
        Date startTime = new Date();

        for (int i = 0; i < m / 4; i++) {
            list.get(i);
        }

        Date finishTime = new Date();
        long finalTime = finishTime.getTime() - startTime.getTime();
        if (list.getClass().getName() == "java.util.LinkedList")
            tmp = "LinkedList";
        else tmp = "ArrayList";
        System.out.println(".get time for from the beginning " + tmp + "(" + m/4 + " cases) = " + finalTime + "ms");
    }



    /**
     * Выводит время выполнения .remove - метода в консоль
     * для заданного типа списка
     * для определенного количества циклов
     * с конца списка
     *
     */
    static void removingTimeEnd(List<Integer> list) {
        String tmp;
        Date startTime = new Date();

        for (int i = m - 1; i > m / 2; i--) {
            list.remove(i);
        }

        Date finishTime = new Date();
        long finalTime = finishTime.getTime() - startTime.getTime();
        if (list.getClass().getName() == "java.util.LinkedList")
            tmp = "LinkedList";
        else tmp = "ArrayList";
        System.out.println(".remove time from the end for " + tmp + "(" + m/2 + " cases) = " + finalTime + "ms");
    }



    /**
     * Выводит время выполнения .get - метода в консоль
     * для заданного типа списка
     * для определенного количества циклов
     * с середины списка
     */
    static void removingTimeMid(List<Integer> list) {

        String tmp;
        Date startTime = new Date();

        for (int i = m / 8; i < m / 4; i++) {
            list.remove(i);
        }

        Date finishTime = new Date();
        long finalTime = finishTime.getTime() - startTime.getTime();
        if (list.getClass().getName() == "java.util.LinkedList")
            tmp = "LinkedList";
        else tmp = "ArrayList";
      System.out.println(".remove time from the middle for " + tmp + "(" + m/8 + " cases) = " + finalTime + "ms");
    }



    /**
     * Выводит время выполнения .get - метода в консоль
     * для заданного типа списка
     * для определенного количества циклов
     * с начала списка
     */
    static void removingTimeBegin(List<Integer> list) {
        String tmp;
        Date startTime = new Date();

        for (int i = 0; i < m/8; i++) {
            list.remove(i);
        }

        Date finishTime = new Date();
        long finalTime = finishTime.getTime() - startTime.getTime();
        if (list.getClass().getName() == "java.util.LinkedList")
            tmp = "LinkedList";
        else tmp = "ArrayList";
        System.out.println(".remove time for from the beginning " + tmp + "(" + m/8 + " cases) = " + finalTime + "ms");
    }


}
