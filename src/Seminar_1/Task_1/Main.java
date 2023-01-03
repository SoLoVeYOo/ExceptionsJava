//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
//Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//   если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//   если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//   если вместо массива пришел null, метод вернет -3
//   придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
//Напишите метод, в котором реализуйте взаимодействие с пользователем.
// То есть, этот метод запросит искомое число у пользователя, вызовет первый,
// обработает возвращенное значение и покажет читаемый результат пользователю. Например, если вернулся -2,
// пользователю выведется сообщение: “Искомый элемент не найден”.

package Seminar_1.Task_1;

import java.util.Scanner;

public class Main {
    static int[] array4;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int zapros = input.nextInt();
        input.close();
        int[] array1 = {1,7,5,32,87,98,3,0,42,5};
        int[] array2 = {1,7,5,32,87,98,3,0,425,6,8};
        int[] array3 = {1,7,6,32,87,98,3,0,425,6,8};
//        System.out.println(getArrInfo(array1, zapros));
//        System.out.println(getArrInfo(array2, zapros));
//        System.out.println(getArrInfo(array3, zapros));
//        printResult(getArrInfo(array1, zapros));
//        printResult(getArrInfo(array2, zapros));
//        printResult(getArrInfo(array3, zapros));
        printResult(getArrInfo(array4, zapros));
    }


    private static int getArrInfo(int[] array, int zapros) {
        int min = 10;
        if (array == null) return -3;
        if (array.length < min) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == zapros) return i;
        }
        return -2;
    }

    private static void printResult(int error) {
        if (error == -3) throw new RuntimeException("Массива не существует");
        else if (error == -2) throw new RuntimeException("Искомого значения в массиве нет");
        else if (error == -1) throw new RuntimeException("Массив меньше заданной длины");
        else System.out.printf("Индекс искомого значения равен: %d", error);
    }
}
