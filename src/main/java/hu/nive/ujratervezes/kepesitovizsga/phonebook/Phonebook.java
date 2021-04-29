package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (output == null) {
            throw new IllegalArgumentException("output cannot be null");
        }
        if (contacts == null) {
            throw new IllegalArgumentException("contacts cannot be null");
        }
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(output))) {
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                String text = String.format("%s: %s", entry.getKey(), entry.getValue());
                writer.write(text);
                writer.write("\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("File cannot write", ioe);
        }
    }
}
