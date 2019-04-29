package com.radchenko.questionnaire;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.lang.String.format;

public class FileReader {

    public static List<String> loadLines(String path) {
        try {
            return Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            throw new RuntimeException(format("Failed to read file by path: %s, exception: %s", path, e));
        }
    }
}
