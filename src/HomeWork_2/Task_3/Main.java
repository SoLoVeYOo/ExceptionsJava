// Дан следующий код, исправьте его там, где требуется
//
// public static void main(String[] args) throws Exception {
//        try {
//        int a = 90;
//        int b = 3;
//        System.out.println(a / b);
//        printSum(23, 234);
//        int[] abc = { 1, 2 };
//        abc[3] = 9;
//        } catch (Throwable ex) {
//        System.out.println("Что-то пошло не так...");
//        } catch (NullPointerException ex) {
//        System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//        System.out.println("Массив выходит за пределы своего размера!");
//        }
//        }
// public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//        System.out.println(a + b);
//        }



package HomeWork_2.Task_3;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        int a = 90;
        int b = 3;
        int[] abc = { 1, 2 };
        try {
            System.out.println(a / b);
            printSum(23, 234);
            abc[3] = 9;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (NullPointerException e) {
            System.out.println("Указатель не может указывать на null!");
        } catch (ArithmeticException e) {
            System.out.println("деление на 0");
        } catch (Throwable e) {
            System.out.println("Что-то пошло не так...");
        }
    }
    private static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
