package services;

import models.LogEntryModel;
import models.RacerModel;
import models.ResultModel;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface ResultService {
    List<ResultModel> getResults(List<LogEntryModel> startLogs, List<LogEntryModel> endLogs, @NotNull List<RacerModel> racers);
}
