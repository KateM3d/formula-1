package main.java.dao;

import main.java.models.RacerModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

public class DAO {
    public static void getListOfRacers() {
        ClassLoader classLoader = DAO.class.getClassLoader();
        List<RacerModel> racers;
        try (InputStream inputStream = classLoader.getResourceAsStream("abbreviations.txt")) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            racers = bufferedReader.lines()
                    .map(line -> line.split("_"))
                    .map(str -> new RacerModel(str[0], str[1], str[2]))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(racers);
    }

    public static void main(String[] args) {
        getListOfRacers();
    }
}
