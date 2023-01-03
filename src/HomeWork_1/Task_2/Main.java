// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов
// двух входящих массивов в той же ячейке. Если длины массивов не равны,
// необходимо как-то оповестить пользователя.

package HomeWork_1.Task_2;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8, 9};
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
            array[i] = arr1[i] - arr2[i];
        }
        return array;
    }

    private static void printArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
