package models;

import java.time.Duration;
import java.time.LocalDateTime;

public class ResultModel {
    private String racerName;
    private String racerTeam;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Duration circleTime;
    private int racerPlace;


    public ResultModel(String racerName, String racerTeam, LocalDateTime startTime, LocalDateTime endTime) {
        this.racerName = racerName;
        this.racerTeam = racerTeam;
        this.startTime = startTime;
        this.endTime = endTime;
        this.circleTime = Duration.between(this.startTime, this.endTime);
    }


    public String getRacerName() {
        return racerName;
    }

    public String getRacerTeam() {
        return racerTeam;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
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

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setRacerPlace(int racerPlace) {
        this.racerPlace = racerPlace;
    }

    @Override
    public String toString() {
        return racerPlace + " |" + racerName + " |" + racerTeam + " |" + circleTime.toMinutesPart() + ":" + circleTime.toSecondsPart() + "." + circleTime.toMillisPart();
    }
}
