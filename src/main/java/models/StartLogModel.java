package main.java.models;

import models.LogEntryModel;

import java.time.LocalDateTime;

public class StartLogModel extends LogEntryModel {
    public StartLogModel(String abbreviation, LocalDateTime startTime) {
        super(abbreviation, startTime);
    }

    public String getAbbreviation() {
        return super.getIdentifier();
    }

    public LocalDateTime getStartTime() {
        return super.getEventTime();
    }

    public void setAbbreviation(String abbreviation) {
        super.setIdentifier(abbreviation);
    }

    public void setStartTime(LocalDateTime startTime) {
        super.setEventTime(startTime);
    }

    @Override
    public String toString() {
        return super.getIdentifier() + " |" + super.getEventTime();
    }
}
