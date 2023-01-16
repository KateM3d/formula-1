package main.java.models;

import java.sql.Time;
import java.util.Date;

public class TimeInfoModel {

    private String abbreviation;
    private String startTime;
    private String endTime;
    private Time circleTime;

    public TimeInfoModel(String abbreviation, Date startTime, Date endTime, Time circleTime) {

        this.abbreviation = abbreviation;
        this.startTime = String.valueOf(startTime);
        this.endTime = String.valueOf(endTime);
        this.circleTime = circleTime;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public Date getCircleTime() {
        return circleTime;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public void setStartTime(Date startTime) {
        this.startTime = String.valueOf(startTime);
    }

    public void setEndTime(Date endTime) {
        this.endTime = String.valueOf(endTime);
    }

    public void setCircleTime(Time circleTime) {
        this.circleTime = circleTime;
    }

    @Override
    public String toString() {
        return abbreviation + " |" +
                startTime + " |" +
                endTime + " |" +
                circleTime;
    }
}
