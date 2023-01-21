package controllers;

import dao.Dao;
import models.LogEntryModel;
import models.RacerModel;
import services.ResultService;
import services.ResultServiceImpl;

import java.util.List;

public class ResultsController {
    public static void main(String[] args) {
        Dao dao = new Dao();
        ResultService resultService = new ResultServiceImpl();

        List<RacerModel> racerModels = dao.getListOfRacers();
        List<LogEntryModel> endLogEntries = dao.getLogEntries("end.log");
        List<LogEntryModel> startLogEntries = dao.getLogEntries("start.log");

        resultService.getResults(startLogEntries, endLogEntries, racerModels)
                .forEach(System.out::println);


    }

}
