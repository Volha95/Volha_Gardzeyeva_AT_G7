package homework.day5.playground.essence.creatures;

abstract class Vertebrata extends Animal {
    public void eat(Insect food) {
        System.out.printf("I am %s and I am eating %s", this.name, Plant food.getName() );
    }
}
