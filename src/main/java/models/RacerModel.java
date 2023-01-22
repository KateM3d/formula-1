package models;

public class RacerModel {
    private String abbreviation;
    private String racerName;
    private String racerTeam;

    public RacerModel(String abbreviation, String racerName, String racerTeam) {
        this.abbreviation = abbreviation;
        this.racerName = racerName;
        this.racerTeam = racerTeam;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getRacerName() {
        return racerName;
    }

    public String getRacerTeam() {
        return racerTeam;
    }

    @Override
    public String toString() {
        return abbreviation + " |" +
                racerName + " |" +
                racerTeam;
    }
}
