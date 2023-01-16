package main.java.models;

import java.sql.Time;

public class ResultModel {
    private String racerName;
    private String racerTeam;
    private Time circleTime;
    private int racerPlace;


    public ResultModel(String abbreviation, String racerName, String racerTeam, Time circleTime, int racerPlace) {
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

    public Time getCircleTime() {
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

    public void setCircleTime(Time circleTime) {
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
