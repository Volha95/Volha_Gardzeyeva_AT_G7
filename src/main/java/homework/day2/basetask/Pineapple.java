package homework.day2.basetask;

public class Pineapple {
    private String grade;
    private float heatCapacity;

    Pineapple(String g, float h) {
        this.grade = g;
        this.heatCapacity = h;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public float getHeatCapacity() {
        return heatCapacity;
    }

    public void setHeatCapacity(float heatCapacity) {
        this.heatCapacity = heatCapacity;
    }

    void printPineappleDetails() {
        if (heatCapacity > 2140) {
            System.out.println("Я ананас, теплоемкость которого больше, чем у ветчины");
        } else {
            System.out.println("В ветчине тепла запасается больше :(");
        }
    }
}

