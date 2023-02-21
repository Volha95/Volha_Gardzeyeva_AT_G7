package project.soda;

abstract class Water {
    private String color;
    private String transparency;
    private String smell;
    private int temperature;

    public Water(String color, String transparency, String smell, int temperature) {
        this.color = color;
        this.transparency = transparency;
        this.smell = smell;
        this.temperature = temperature;
    }
}

