package dao;

import models.LogEntryModel;
import models.RacerModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Dao {
    static ClassLoader classLoader = Dao.class.getClassLoader();

    private BufferedReader getBufferedReader(String resource) {
        return new BufferedReader(new InputStreamReader(Objects.requireNonNull(classLoader.getResourceAsStream(resource)), StandardCharsets.UTF_8));
    }

    public List<RacerModel> getListOfRacers(String logFile) {
        List<RacerModel> racers;

        try (BufferedReader bufferedReader = getBufferedReader(logFile)) {
            racers = bufferedReader.lines()
                    .map(line -> line.split("_"))
                    .map(str -> new RacerModel(str[0], str[1], str[2]))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return racers;
    }

    public List<LogEntryModel> getLogEntries(String logFile) {
        List<LogEntryModel> logEntries;

        try (BufferedReader bufferedReader = getBufferedReader(logFile)) {
            logEntries = bufferedReader.lines()
                    .map(line -> {
                        String nameLastTeamAbbreviation = line.substring(0, 3);
                        String str = line.substring(3);
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[yyyy-MM-dd_HH:mm:ss[.SSS]]");
                        LocalDateTime cycleEndTime = LocalDateTime.parse(str, formatter);
                        return new LogEntryModel(nameLastTeamAbbreviation, cycleEndTime);
                    })
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return logEntries;
    }
}
