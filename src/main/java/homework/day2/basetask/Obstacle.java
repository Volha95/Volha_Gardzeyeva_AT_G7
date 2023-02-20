package homework.day2.basetask;

public class Obstacle {
    public String description;
    public String severity;

    Obstacle(String d, String s) {
        description = d;
        severity = s;
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

    public static void main(String[] args) {
        Obstacle obstacle = new Obstacle("в виде дыры", "критическое");
        obstacle.printObstracleDetails();
    }
}
