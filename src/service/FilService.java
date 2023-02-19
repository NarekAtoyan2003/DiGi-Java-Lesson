package service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FilService {
    public static String[] read(String url) throws Exception{

        return Files.readAllLines(Path.of(url)).toArray(new String[0]);

    }
    public static void wrait (String url, String argument) throws Exception {
        Files.write(Path.of(url), argument.getBytes(), StandardOpenOption.CREATE);
    }
}
