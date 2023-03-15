package homework.day6.generics;

import homework.day5.playground.essence.craft.air.Copter;
import homework.day5.playground.essence.craft.air.Plane;
import homework.day5.playground.essence.craft.air.Rocket;
import homework.day5.playground.essence.craft.field.Car;
import homework.day5.playground.essence.craft.field.Moped;
import homework.day5.playground.essence.craft.field.Motorbike;
import homework.day5.playground.essence.craft.hand.*;
import homework.day5.playground.essence.creatures.*;
import homework.day5.playground.essence.material.*;
import homework.day6.generics.GenericMethodsInGenericClassTwoParams;

public class GenericMethodsInGenericClassTwoParamsRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, String> genericTwoParamsStrStr = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Integer> genericTwoParamsStrInt = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Double> genericTwoParamsStrDoub = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Integer, Integer> genericTwoParamsIntInt = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Beetle, Mosquito> genericTwoParamsBeetleMosquito = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Fly, Pigeon> genericTwoParamsFlyPigeon = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Raven, Crocodile> genericTwoParamsRavenCrocodile = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Maylily, Rose> genericTwoParamsMaylilyRose = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Chamomile, Potato> genericTwoParamsChamomilePotato = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Carrot, Radish> genericTwoParamsCarrotRadish = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Plane, Copter> genericTwoParamsPlaneCopter = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Rocket, Car> genericTwoParamsRocketCar = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Motorbike, Moped> genericTwoParamsMotorbikeMoped = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Bottle, Mug> genericTwoParamsBottleMug = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Can, Petrol> genericTwoParamsCanPetrol = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Diesel, Water> genericTwoParamsDieselWater = new GenericMethodsInGenericClassTwoParams<>();

        System.out.println(genericTwoParamsStrStr.genericMethodGenArgs("cat"));
        System.out.println(genericTwoParamsStrStr.genericMethodGenArgs("Hello", "world!"));
        genericTwoParamsStrStr.genericMethodHalfGenArgs("water", "telephone");
        genericTwoParamsStrStr.genericMethodHalfGenArgs("abc", "123", "generics");

        System.out.println(genericTwoParamsStrInt.genericMethodGenArgs("dog"));
        System.out.println(genericTwoParamsStrInt.genericMethodGenArgs("bird", 12345));
        genericTwoParamsStrInt.genericMethodHalfGenArgs("home", "mouse");
        genericTwoParamsStrInt.genericMethodHalfGenArgs("carrot", 2, "small");

        System.out.println(genericTwoParamsStrDoub.genericMethodGenArgs("table"));
        System.out.println(genericTwoParamsStrDoub.genericMethodGenArgs("chicken", 545.5));
        genericTwoParamsStrDoub.genericMethodHalfGenArgs("run", "time");
        genericTwoParamsStrDoub.genericMethodHalfGenArgs("wide", 17.777, "narrow");

        System.out.println(genericTwoParamsIntInt.genericMethodGenArgs(789));
        System.out.println(genericTwoParamsIntInt.genericMethodGenArgs(456723, 1224));
        genericTwoParamsIntInt.genericMethodHalfGenArgs(7777, "winter");
        genericTwoParamsIntInt.genericMethodHalfGenArgs(456, 89999, "summer");

        System.out.println(genericTwoParamsBeetleMosquito.genericMethodGenArgs(new Beetle(4, "Zhuck")));
        System.out.println(genericTwoParamsBeetleMosquito.genericMethodGenArgs(new Beetle(7, "Mark"), new Mosquito()));
        genericTwoParamsBeetleMosquito.genericMethodHalfGenArgs(new Beetle(1, "Mak"), "spring");
        genericTwoParamsBeetleMosquito.genericMethodHalfGenArgs(new Beetle(1, "Usach"), new Mosquito(4, "Jack"), "midnight");

        System.out.println(genericTwoParamsFlyPigeon.genericMethodGenArgs(new Fly(1, "Rob")));
        System.out.println(genericTwoParamsFlyPigeon.genericMethodGenArgs(new Fly(8, "Domestica Flyable"), new Pigeon(78, "Oliver")));
        genericTwoParamsFlyPigeon.genericMethodHalfGenArgs(new Fly(7, "Nick"), "century");
        genericTwoParamsFlyPigeon.genericMethodHalfGenArgs(new Fly(4, "Neel"), new Pigeon(91, "Jacob"), "student");

        System.out.println(genericTwoParamsRavenCrocodile.genericMethodGenArgs(new Raven(19, "Thomas")));
        System.out.println(genericTwoParamsRavenCrocodile.genericMethodGenArgs(new Raven(17, "George"), new Crocodile(800, "Noah")));
        genericTwoParamsRavenCrocodile.genericMethodHalfGenArgs(new Raven(78, "Michael"), "telephone");
        genericTwoParamsRavenCrocodile.genericMethodHalfGenArgs(new Raven(90, "Alexander"), new Crocodile(900, "Connor"), "elephant");

        System.out.println(genericTwoParamsMaylilyRose.genericMethodGenArgs(new Maylily(41, "Melanie")));
        System.out.println(genericTwoParamsMaylilyRose.genericMethodGenArgs(new Maylily(10, "Victoria"), new Rose(17, "Афина")));
        genericTwoParamsMaylilyRose.genericMethodHalfGenArgs(new Maylily(32, "Barbara"), "set");
        genericTwoParamsMaylilyRose.genericMethodHalfGenArgs(new Maylily(19, "Rebecca"), new Rose(22, "Ностальжи"), "probable ");

        System.out.println(genericTwoParamsChamomilePotato.genericMethodGenArgs(new Chamomile(13, "Стефания")));
        System.out.println(genericTwoParamsChamomilePotato.genericMethodGenArgs(new Chamomile(10, "Римская"), new Potato(100, "Аврора")));
        genericTwoParamsChamomilePotato.genericMethodHalfGenArgs(new Chamomile(23, "Вирал Суприм"), "reason");
        genericTwoParamsChamomilePotato.genericMethodHalfGenArgs(new Chamomile(17, "Крейзи Дейзи"), new Potato(110, "Альбатрос"), "energy");

        System.out.println(genericTwoParamsCarrotRadish.genericMethodGenArgs(new Carrot(50, "Амстердамская")));
        System.out.println(genericTwoParamsCarrotRadish.genericMethodGenArgs(new Carrot(70, "Тушон"), new Radish(26, "Рондеел")));
        genericTwoParamsCarrotRadish.genericMethodHalfGenArgs(new Carrot(71, "Оранжевый мускат"), "reason");
        genericTwoParamsCarrotRadish.genericMethodHalfGenArgs(new Carrot(52, "Парижская каротель"), new Radish(27, "Рампух"), "weight");

        System.out.println(genericTwoParamsPlaneCopter.genericMethodGenArgs(new Plane(555, "Fokker")));
        System.out.println(genericTwoParamsPlaneCopter.genericMethodGenArgs(new Plane(1000, "Ан-12"), new Copter(1100, "Ми-38")));
        genericTwoParamsPlaneCopter.genericMethodHalfGenArgs(new Plane(2000, "Ли-2"), "reason");
        genericTwoParamsPlaneCopter.genericMethodHalfGenArgs(new Plane(2100, "Ил-114"), new Copter(2145, "Ка-62"), "present");

        System.out.println(genericTwoParamsRocketCar.genericMethodGenArgs(new Rocket(55555, "Black Brant")));
        System.out.println(genericTwoParamsRocketCar.genericMethodGenArgs(new Rocket(74586, "Victoria"), new Car(7841, "Aston Martin")));
        genericTwoParamsRocketCar.genericMethodHalfGenArgs(new Rocket(47976, "Союз ТМА-3"), "reason");
        genericTwoParamsRocketCar.genericMethodHalfGenArgs(new Rocket(46786, "Союз-2.1а"), new Car(4643, "Ferrari"), "window");

        System.out.println(genericTwoParamsMotorbikeMoped.genericMethodGenArgs(new Motorbike(7425, "Ducati")));
        System.out.println(genericTwoParamsMotorbikeMoped.genericMethodGenArgs(new Motorbike(8541, "Dodge Tomahawk"), new Moped(1245, "Yamaha")));
        genericTwoParamsMotorbikeMoped.genericMethodHalfGenArgs(new Motorbike(5426, "Suzuki"), "reason");
        genericTwoParamsMotorbikeMoped.genericMethodHalfGenArgs(new Motorbike(45763, "Ninja"), new Moped(2000, "Lifan"), "board");

        System.out.println(genericTwoParamsBottleMug.genericMethodGenArgs(new Bottle(1, "My bottle")));
        System.out.println(genericTwoParamsBottleMug.genericMethodGenArgs(new Bottle(2, "BBottle"), new Mug(3, "Muggi")));
        genericTwoParamsBottleMug.genericMethodHalfGenArgs(new Bottle(4, "Bottle2"), "reason");
        genericTwoParamsBottleMug.genericMethodHalfGenArgs(new Bottle(5, "Barbara"), new Mug(6, "My Mug"), "exercise");

        System.out.println(genericTwoParamsCanPetrol.genericMethodGenArgs(new Can(1, "1L")));
        System.out.println(genericTwoParamsCanPetrol.genericMethodGenArgs(new Can(2, "2L"), new Petrol()));
        genericTwoParamsCanPetrol.genericMethodHalfGenArgs(new Can(4, "3L"), "reason");
        genericTwoParamsCanPetrol.genericMethodHalfGenArgs(new Can(5, "1,5L"), new Petrol(), "somebody");

        System.out.println(genericTwoParamsDieselWater.genericMethodGenArgs(new Diesel()));
        System.out.println(genericTwoParamsDieselWater.genericMethodGenArgs(new Diesel(), new Water()));
        genericTwoParamsDieselWater.genericMethodHalfGenArgs(new Diesel(), "reason");
        genericTwoParamsDieselWater.genericMethodHalfGenArgs(new Diesel(), new Water(), "instrument");
    }
}
