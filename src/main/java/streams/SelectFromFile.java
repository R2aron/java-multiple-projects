package streams;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.io.IOException;

// Create a stream from a text file and use stream operations to find and print the longest word in the file.

public class SelectFromFile {
    public static void main(String[] args) {
        String fileName = "Story.txt";
        String outputFile = "LongestWord.txt";

        String longestWord = getLongestWord(fileName);
        System.out.println("Longest word: " + longestWord);

        try {
            File obj = new File(outputFile);
            if (obj.createNewFile()) {
                System.out.println("File created: " + obj.getName());
            } else {
                System.out.println("File already exists");
            }

            try (FileWriter writer = new FileWriter(outputFile)) {
                writer.write(longestWord);
            }

        } catch (IOException e) {
            System.out.println("Error writing to file");
            e.printStackTrace();
        }
    }

    public static String getLongestWord(String fileName) {
        try {
            return Files.lines(Paths.get(fileName))
                    .flatMap(line -> Arrays.stream(line.split("\\s+")))
                    .max(Comparator.comparingInt(String::length))
                    .orElse("No word found");
        } catch (IOException e) {
            e.printStackTrace();
            return "Error reading file";
        }
    }
}
