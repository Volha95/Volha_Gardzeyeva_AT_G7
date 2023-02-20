package homework.day2.basetask;

public class Pineapple {
    public String grade;
    public float heatCapacity;

    Pineapple(String g, float h) {
        grade = g;
        heatCapacity = h;
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

    public static void main(String[] args) {
        Pineapple pineapple = new Pineapple("Abacaxi", 2150.0f);
        pineapple.printPineappleDetails();
    }
}

