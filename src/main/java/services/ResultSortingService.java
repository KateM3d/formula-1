package services;

import main.java.models.EndLogModel;
import main.java.models.RacerModel;
import main.java.models.StartLogModel;
import main.java.models.ResultModel;

import java.util.List;

public interface ResultSortingService {
    List<ResultModel> circleTimeAscendingSort(List<ResultModel> results);
}
