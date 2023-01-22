package services;

import models.LogEntryModel;
import models.RacerModel;
import models.ResultModel;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class ResultServiceImpl implements ResultService {


    @Override
    public List<ResultModel> getResults(List<LogEntryModel> startLogs, List<LogEntryModel> endLogs, @NotNull List<RacerModel> racers) {
        List<ResultModel> results = racers.stream()
                .map(r -> {
                    LocalDateTime startTime = Objects.requireNonNull(startLogs.stream()
                                    .filter(st -> st.getIdentifier()
                                            .equals(r.getAbbreviation()))
                                    .findAny()
                                    .orElse(null))
                            .getEventTime();

                    LocalDateTime endTime = Objects.requireNonNull(endLogs.stream()
                                    .filter(et -> et.getIdentifier()
                                            .equals(r.getAbbreviation()))
                                    .findAny()
                                    .orElse(null))
                            .getEventTime();

                    return new ResultModel(r.getRacerName(), r.getRacerTeam(), startTime, endTime);
                })
                .sorted(Comparator.comparingLong(rm -> rm.getCircleTime().toMillis()))
                .toList();

        IntStream.range(1, results.size() + 1).forEachOrdered(i -> results.get(i-1).setRacerPlace(i));
        return results;
    }
}
