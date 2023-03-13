package HomeWork_3_prog;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public Writer(Person person) throws Exception {
        String fileName = person.getSurname();
        String forWrite = person.toStringPerson();
        try (FileWriter writer = new FileWriter(String.format("src/HomeWork_3_prog/%s.txt", fileName), true)) {
            writer.append(forWrite);
            writer.append("\n");
            writer.flush();
            System.out.println("\nThe data entered is correct and written to a file");
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
