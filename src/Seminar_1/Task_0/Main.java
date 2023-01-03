// Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
// Если длина массива меньше некоторого заданного минимума,
// метод возвращает -1, в качестве кода ошибки, иначе - длину массива.

package Seminar_1.Task_0;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,7,5,32,87,98,3,0,425};
        System.out.println(getArrLenght(array));
    }

    private static int getArrLenght(int[] array) {
        int min = 10;
        if (array.length < min) {
            return -1;
        }
        return array.length;
    }
}
