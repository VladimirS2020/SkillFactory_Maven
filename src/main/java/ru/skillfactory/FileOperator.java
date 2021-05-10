package ru.skillfactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileOperator {

    public String read(String rawPath) throws IOException {
        Path path = Paths.get(rawPath);
        List<String> strings = Files.readAllLines(path);
        return strings.get(0);
    }

    public List<String> readAsList(String rawPath) throws IOException{
        Path path = Paths.get(rawPath);
        return Files.readAllLines(path);
    }

    public void write(String data, String rawPath) throws IOException {
        Path path = Paths.get(rawPath);
        Files.write(path, data.getBytes());
    }

}
