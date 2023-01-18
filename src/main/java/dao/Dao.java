package dao;

import main.java.models.EndLogModel;
import main.java.models.RacerModel;
import main.java.models.StartLogModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Dao {
    static ClassLoader classLoader = Dao.class.getClassLoader();

    private BufferedReader getBufferedReader(String resource) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Objects.requireNonNull(classLoader.getResourceAsStream(resource)), StandardCharsets.UTF_8));
        return bufferedReader;
    }

    public List<RacerModel> getListOfRacers() {
        List<RacerModel> racers;

        try (BufferedReader bufferedReader = getBufferedReader("abbreviations.txt")) {
            racers = bufferedReader.lines()
                    .map(line -> line.split("_"))
                    .map(str -> new RacerModel(str[0], str[1], str[2]))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return racers;
    }

    public List<EndLogModel> getEndLog() {
        List<EndLogModel> endLogInfo;

        try (BufferedReader bufferedReader = getBufferedReader("end.log")) {
            endLogInfo = bufferedReader.lines()
                    .map(line -> {
                        String nameLastTeamAbbreviation = line.substring(0, 3);
                        String str = line.substring(3);
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[yyyy-MM-dd_HH:mm:ss[.SSS]]");
                        LocalDateTime cycleEndTime = LocalDateTime.parse(str, formatter);
                        return new EndLogModel(nameLastTeamAbbreviation, cycleEndTime);
                    })
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return endLogInfo;
    }

    public List<StartLogModel> getStartLog() {
        List<StartLogModel> startLogInfo;

        try (BufferedReader bufferedReader = getBufferedReader("end.log")) {
            startLogInfo = bufferedReader.lines()
                    .map(line -> {
                        String nameLastTeamAbbreviation = line.substring(0, 3);
                        String str = line.substring(3);
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[yyyy-MM-dd_HH:mm:ss[.SSS]]");
                        LocalDateTime cycleStartTime = LocalDateTime.parse(str, formatter);
                        return new StartLogModel(nameLastTeamAbbreviation, cycleStartTime);
                    })
                    .collect(Collectors.toList());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return startLogInfo;
    }
}
