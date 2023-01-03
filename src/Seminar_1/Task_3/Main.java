//Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
//Метод должен пройтись по каждому элементу и проверить что он не равен null.
//А теперь реализуйте следующую логику:
//Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

package Seminar_1.Task_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    Integer[] array1 = {1,2,3,4,5};
    Integer[] array2 = {1,null,3,null,5};
//    checkArray(array1);
//    checkArray1(array2);
    checkArray2(array2);
    }

    private static void checkArray1(Integer[] array){
        boolean flag = true;
        List<Integer> indexNull = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                flag = false;
                indexNull.add(i);
            }
        }
        if (!flag){
            throw new RuntimeException("В массиве присутсвует 'null'.\n" + "Индексы где значения массива 'null': " + indexNull);
        }
    }

    private static void checkArray2(Integer[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                System.out.println("В массиве присутсвует 'null'.\n" + "Его индекс " + i);;
            }
        }
    }
}
