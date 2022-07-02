package practiceExam_3.task1;

    /* 1. Создать массив, заполнить его значениями от 1 до 100.
    Перенести чётные числа из массива в HashSet.
    При переносе в HashSet соблюсти правило - в начале должны быть числа, которые делятся на 5 без остатка,
    а в конце те, что не делятся
    */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;


public class Task_1 { //
    public static void main(String[] args) {

        int [] number = new int[100];

            LinkedList <Integer> numbers = new LinkedList<>();

            // Через массив нельзя перенести в HashSet.
            // Потому что HashSet воспринимает всё рандомно, если не использовать LinkedList. Оно не будет саблюдать условие.

                for (int i = 0; i < number.length; i++) {
                    number [i] = i + 1;
                if (number[i] % 2 == 0 && number[i] % 5 == 0) {
                    numbers.addFirst(number[i]);
                } else if (number[i] % 2 == 0 && number[i] % 5 != 0) {
                    numbers.addLast(number[i]);
            }
        }

        HashSet <Integer> a = new LinkedHashSet<>(numbers);
        System.out.println("Числа без остатка, с остаткам: " + a);
    }
}
