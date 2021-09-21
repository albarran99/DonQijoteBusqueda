package org.iesfm.filesearch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchTextExample {

    public static int search(String text) {
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(
                new FileReader(
                        "src/main/resources/el_quijote.txt"))
        ) {
            String line = reader.readLine();
            while (line != null) {
                if (line.contains(text)) {
                    lines++;
                }
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();

        }

        return lines;
    }
}
