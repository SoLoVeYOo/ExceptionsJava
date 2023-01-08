//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package HomeWork_2.Task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = input.nextLine();
        if (text.isEmpty()) throw new RuntimeException("Пустые строки вводить нельзя");
        else System.out.println(text);
        input.close();
    }
}
