// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов
// двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо
// как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
// которое пользователь может увидеть - RuntimeException, т.е. ваше.

package HomeWork_1.Task_3;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {10, 12, 14, 16};
        int[] array2 = {5, 6, 7, 8};
//        int[] array2 = {5, 6, 7, 8, 9};
//        int[] array2 = {5, 6, 7, 0};
//        int[] array2 = {5, 6, 7, 8, 0};
        printArray(getNewArray(array1,array2));
    }

    private static int[] getNewArray(int[] arr1, int[] arr2){
        int size = 0;
        if (arr1.length != arr2.length) {
            System.out.println("Длины массивов не равны");
            if (arr1.length > arr2.length) size = arr2.length;
            else size = arr1.length;
        }
        else size = arr1.length;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            if (arr2[i] == 0) throw new RuntimeException("Создание массива невозможно. Деление на 0!");
            else array[i] = arr1[i] / arr2[i];
        }
        return array;
    }

    private static void printArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
