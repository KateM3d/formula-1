package main.java.models;

import java.time.LocalDateTime;

public class StartLogModel {
    private String abbreviation;
    private LocalDateTime startTime;

    public StartLogModel(String abbreviation, LocalDateTime startTime) {

        this.abbreviation = abbreviation;
        this.startTime = startTime;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return abbreviation + " |" +
                startTime;
    }
}
