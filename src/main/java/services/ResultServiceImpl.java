package services;

import main.java.models.EndLogModel;
import main.java.models.RacerModel;
import main.java.models.ResultModel;
import main.java.models.StartLogModel;

public class ResultServiceImpl implements ResultService {
    @Override
    public ResultModel getResult(RacerModel racer, EndLogModel endLog, StartLogModel startLog) {

        // 1. add results to ResultModel
        // 2. calculate difference between start-log and endloop.
        // 2. sort results
        return null;
    }
}
