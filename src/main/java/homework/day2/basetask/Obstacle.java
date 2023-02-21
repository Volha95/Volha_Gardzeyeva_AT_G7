package homework.day2.basetask;

public class Obstacle {
    private String description;
    private String severity;

    Obstacle(String d, String s) {
        this.description = d;
        this.severity = s;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    void printObstracleDetails() {
        System.out.println("Возникло " + severity + " препятствие " + description);
    }

}
