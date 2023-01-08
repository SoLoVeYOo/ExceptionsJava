//Если необходимо, исправьте данный код
//        try {
//             int d = 0;
//             double catchedRes1 = intArray[8] / d;
//             System.out.println("catchedRes1 = " + catchedRes1);
//         } catch (ArithmeticException e) {
//             System.out.println("Catching exception: " + e);
//         }

package HomeWork_2.Task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1. переменную d стоит вынести за try
//        2. отсутствует массив с выбраным значением
//        3. код в принципе не дееспособный, т.к. постоянно будет деление на ноль
//        Мой вариант:
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Введите делитель (целое число): ");
            int d = Integer.parseInt(input.next());
            System.out.println("Введите индекс массива (целое число): ");
            int index = Integer.parseInt(input.next());
            double catchedRes1 = intArray[index] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
            input.close();
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0. " + e);
        } catch (NumberFormatException e) {
            System.out.println("Введено не целое число. " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Нет данного индекса в массиве. " + e);
        }
    }
}
