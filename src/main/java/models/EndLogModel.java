package models;

import models.LogEntryModel;

import java.time.LocalDateTime;

public class EndLogModel extends LogEntryModel {

    public EndLogModel(String abbreviation, LocalDateTime endTime) {
        super(abbreviation, endTime);
    }

    public String getAbbreviation() {
        return super.getIdentifier();
    }

    public LocalDateTime getEndTime() {
        return super.getEventTime();
    }

    public void setAbbreviation(String abbreviation) {
        super.setIdentifier(abbreviation);
    }

    public void setEndTime(LocalDateTime endTime) {
        super.setEventTime(endTime);
    }

    @Override
    public String toString() {
        return super.getIdentifier() + " |" +
                super.getEventTime();
    }
}
