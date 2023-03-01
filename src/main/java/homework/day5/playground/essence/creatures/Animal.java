package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Matter;

abstract class Animal extends Matter {
    protected String name;
    Animal(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void eat(Plant food) {


        System.out.printf("I am %s and I am eating %s", this.name, food);
    }
}
