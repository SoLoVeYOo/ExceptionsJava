package HomeWork_3_prog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * Так как распарсить вводимые данные точно по ФИО невозможно без баз данных
     * (была мысль отсортировать отчества по окончанию "-вич" или "-вна", но как оказалось есть фамилии с таким окончанием)
     * принимается что первая строка с буквами - фамилия, вторая - имя, третья - отчество
     */
    public static void main(String[] args) throws Exception {

        Writer writer = new Writer(Person.ParsingPersonInfo(infoInput()));

    }

    public static ArrayList<String> infoInput() throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите данные через пробел:\nФамилия Имя Отчество Дата рождения (dd.mm.yyyy) Номер телефона (7**********) Пол (f/m): \n");
        String infoInput = input.nextLine();
        ArrayList<String> infoPerson = new ArrayList<String>(List.of(infoInput.split(" ")));
        input.close();

        new ChekInputInfoSize(infoPerson);

        return infoPerson;
    }

}
