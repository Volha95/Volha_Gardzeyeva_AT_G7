package homework.day5.playground.essence.craft.hand;

import homework.day5.playground.essence.Matter;

abstract class Container extends Matter {
    protected String name;
    Container(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
