package dao;

import main.java.models.RacerModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Dao {
    ClassLoader
            classLoader =
            Dao.class.getClassLoader();

    private BufferedReader getBufferedReader(String resource) {
        BufferedReader
                bufferedReader =
                new BufferedReader(new InputStreamReader(Objects.requireNonNull(classLoader.getResourceAsStream(resource)),
                        StandardCharsets.UTF_8));
        return bufferedReader;
    }

    public List<RacerModel> getListOfRacers() {
        List<RacerModel>
                racers;

        try (BufferedReader bufferedReader = getBufferedReader("abbreviations.txt")) {
            racers =
                    bufferedReader.lines()
                            .map(line -> line.split("_"))
                            .map(str -> new RacerModel(str[0],
                                    str[1],
                                    str[2]))
                            .collect(Collectors.toList());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return racers;
    }

    public static void main(String[] args) {
        System.out.println("hhhh");
    }
}
