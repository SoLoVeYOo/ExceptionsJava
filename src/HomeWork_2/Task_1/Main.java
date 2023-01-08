// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

package HomeWork_2.Task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(getFloatNumber1());
        System.out.println(getFloatNumber2());
    }

    /** С использования try-catch
     *
     */
    private static float getFloatNumber1() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Введите дробное число (разделитель - запятая): ");
            try {
                float number1 = input.nextFloat();
                input.close();
                return number1;
            } catch (Exception e) {
                System.out.println("Введено не дробное число! Повторите ввод. Ошибка:  " + e);
                input.nextLine();
            }
        }
    }

    /** Без использования try-catch
     *
     */
    private static float getFloatNumber2() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Введите дробное число (разделитель - запятая): ");
            if (input.hasNextFloat()) {
                float number2 = Float.parseFloat(input.next().replace(",", "."));
                input.close();
                return number2;
            } else {
                System.out.println("Введено не дробное число! Повторите ввод.");
                input.nextLine();
            }
        }
    }
}