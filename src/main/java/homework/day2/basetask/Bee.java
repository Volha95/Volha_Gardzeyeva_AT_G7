package homework.day2.basetask;

public class Bee {
    private String gender;
    private long weight;

    Bee(String g, long w) {
        this.gender = g;
        this.weight = w;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    void printBeeDetails() {
        System.out.println("Я легче лося в " + 500 / weight + " раз");
    }

}
