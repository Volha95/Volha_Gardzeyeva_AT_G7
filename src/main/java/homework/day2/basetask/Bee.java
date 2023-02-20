package homework.day2.basetask;

public class Bee {
    private String gender;
    private long weight;

    Bee(String g, long w) {
        gender = g;
        weight = w;
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

    public static void main(String[] args) {
        Bee bee = new Bee("female", (long) 1);
        bee.printBeeDetails();
    }
}
