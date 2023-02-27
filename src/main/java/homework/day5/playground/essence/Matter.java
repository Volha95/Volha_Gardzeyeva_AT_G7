package homework.day5.playground.essence;

abstract class Matter {
    protected int mass;

    Matter(int mass) {
        this.mass = mass;
    }
    public int getMass(){
        return mass;
    }
    public void setMass(int mass) {
        this.mass = mass;
    }

}
