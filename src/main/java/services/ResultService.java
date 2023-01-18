package services;

import main.java.models.EndLogModel;
import main.java.models.RacerModel;
import main.java.models.StartLogModel;
import main.java.models.ResultModel;

public interface ResultService {
    ResultModel getResult(RacerModel racer, EndLogModel endLog, StartLogModel startLog);
}
