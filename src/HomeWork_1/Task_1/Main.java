// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

package HomeWork_1.Task_1;

public class Main {
    public static void main(String[] args) {

        createArray(-1);
        stringToInt("бла");
        getSum(1);

    }

    private static int[] createArray(int size) {
        return new int[size];
    }

    private static int stringToInt(String input) {
        return Integer.parseInt(input);
    }

    public static int getSum(int x) {
        return x + getSum(x);
    }

}