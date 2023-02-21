package homework.day2.basetask;

public class Souce {
    private String name;
    private String color;

    Souce(String n, String c) {
        this.name = n;
        this.color = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void printSouceDetails() {
        System.out.println("Это соус " + name + " " + color + " цвета");
    }

}