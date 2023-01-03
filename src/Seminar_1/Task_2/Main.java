//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//Необходимо посчитать и вернуть сумму элементов этого массива.
//При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами
// (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
//Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.

package Seminar_1.Task_2;

public class Main {
    public static void main(String[] args) {
        int [][] twoArray1 = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        int [][] twoArray2 = {{5,7,3}, {7,0,1}, {8,1,2}};
        int [][] twoArray3 = {{1,0,0}, {0,1,0}, {0,0,1}};
//        System.out.println(getSumArray(twoArray1));
//        System.out.println(getSumArray(twoArray2));
        System.out.println(getSumArray(twoArray3));
    }

    private static int getSumArray(int[][] array) {
        int sum = 0;
        if (array.length != array[0].length) throw new RuntimeException("Неквадратный массив");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 0 || array[i][j] == 1)
                    sum += array[i][j];
                else throw new RuntimeException("Значения в массиве не равны 0 или 1");

//                if (array[i][j] != 1 && array[i][j] != 0)
//                    throw new RuntimeException("Значения в массиве не равны 0 или 1");
//                else sum += array[i][j];
            }
        }
        return sum;
    }
}
