package services;

import models.LogEntryModel;
import models.RacerModel;
import models.ResultModel;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class ResultServiceImpl implements ResultService {


    @Override
    public List<ResultModel> getResults(List<LogEntryModel> startLogs, List<LogEntryModel> endLogs, @NotNull List<RacerModel> racers) {
        return racers.stream()
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
                .toList();
    }

}
