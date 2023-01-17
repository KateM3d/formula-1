package main.java.models;

import java.time.LocalDateTime;

public class EndLogModel {
    private String abbreviation;
    private LocalDateTime endTime;

    public EndLogModel(String abbreviation, LocalDateTime endTime) {

        this.abbreviation = abbreviation;
        this.endTime = endTime;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return abbreviation + " |" +
                endTime;
    }
}
