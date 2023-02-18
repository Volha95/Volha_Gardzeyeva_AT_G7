public class Bubble {
    public static void main(String[] args) {
        System.out.println("Cramp!");
    }
    private double volume;
    private String consist;
    Bubble (double v, String c) {
        volume = v;
        consist = c;
        v = 0.3;
    }
    public String getConsist() {
        return consist;
    }
    public void setConsist(String consist) {
        this.consist = consist;
    }
}