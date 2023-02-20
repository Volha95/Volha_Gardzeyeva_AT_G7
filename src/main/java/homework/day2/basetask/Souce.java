package homework.day2.basetask;

public class Souce {
    private String name;
    private String color;

    Souce(String n, String c) {
        name = n;
        color = c;
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

    public static void main(String[] args) {
        Souce souce = new Souce("Hainz", "brown");
        souce.printSouceDetails();
    }
}