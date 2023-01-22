package models;

import java.time.LocalDateTime;

public class LogEntryModel {
    private String identifier;
    private LocalDateTime eventTime;

    public LogEntryModel(String identifier, LocalDateTime eventTime) {
        this.identifier = identifier;
        this.eventTime = eventTime;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public LocalDateTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(LocalDateTime eventTime) {
        this.eventTime = eventTime;
    }
}
