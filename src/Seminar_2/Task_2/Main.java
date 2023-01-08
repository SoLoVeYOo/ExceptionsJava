package Seminar_2.Task_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> map = readFromFile();
        showMap(map);
        writeToFile(map);

        // for (Map.Entry entry : map.entrySet()) {

        // System.out.println("Key: " + entry.getKey() + " Value: "
        // + entry.getValue());

        // }

    }

    public static HashMap<String, String> readFromFile() {
        HashMap<String, String> map = new HashMap<>();
        String line = "";

        try {
            FileReader reader = new FileReader("Seminar2/data.txt");
            int c;
            while ((c = reader.read()) != -1) {

                line += (char) c;

            }
            String[] lines = line.split("\n");
            for (int i = 0; i < lines.length; i++) {
                String[] x = lines[i].split("=");
                map.put(x[0], x[1].strip());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return map;
    }

    public static void showMap(HashMap<String, String> map) {
        for (Map.Entry entry : map.entrySet()) {
            findChar(entry);
        }

    }

    public static void findChar(Map.Entry<String, String> entry) {

        if (entry.getValue().equals("?") || entry.getValue().equals("?\n")) {
            entry.setValue(String.valueOf(entry.getKey().length()));
        }

    }

    public static void writeToFile(HashMap<String, String> map) {
        try {
            FileWriter writer = new FileWriter("Seminar2/data2.txt");
            for (Map.Entry entry : map.entrySet()) {
                writer.append(entry.getKey() + "=" + entry.getValue() + "\n");

            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
