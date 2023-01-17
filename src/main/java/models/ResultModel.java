package main.java.models;

import java.sql.Time;
import java.time.Duration;
import java.time.LocalDateTime;

public class ResultModel {
    private String racerName;
    private String racerTeam;
    private Duration circleTime;
    private int racerPlace;


    public ResultModel(String abbreviation, String racerName, String racerTeam, Duration circleTime, int racerPlace) {
        this.racerName = racerName;
        this.racerTeam = racerTeam;
        this.circleTime = circleTime;
        this.racerPlace = racerPlace;
    }

    public String getRacerName() {
        return racerName;
    }

    public String getRacerTeam() {
        return racerTeam;
    }

    public Duration getCircleTime() {
        return circleTime;
    }

    public int getRacerPlace() {
        return racerPlace;
    }

    public void setRacerName(String racerName) {
        this.racerName = racerName;
    }

    public void setRacerTeam(String racerTeam) {
        this.racerTeam = racerTeam;
    }

    public void setCircleTime(Duration circleTime) {
        this.circleTime = circleTime;
    }

    public void setRacerPlace(int racerPlace) {
        this.racerPlace = racerPlace;
    }

    @Override
    public String toString() {
        return racerPlace + " |" +
                racerName + " |" +
                racerTeam + " |" + circleTime;
    }
}
