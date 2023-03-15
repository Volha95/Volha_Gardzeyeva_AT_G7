package homework.day6;

import homework.day5.playground.essence.craft.air.Copter;
import homework.day5.playground.essence.craft.air.Plane;
import homework.day5.playground.essence.craft.air.Rocket;
import homework.day5.playground.essence.craft.field.Car;
import homework.day5.playground.essence.craft.field.Moped;
import homework.day5.playground.essence.craft.field.Motorbike;
import homework.day5.playground.essence.craft.hand.*;
import homework.day5.playground.essence.creatures.*;
import homework.day5.playground.essence.material.*;

public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassT<String> genericMethodsString = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Integer> genericMethodsInteger = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Double> genericMethodsDouble = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Beetle> genericMethodsBeetle = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mosquito> genericMethodsMosquito = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Fly> genericMethodsFly = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Pigeon> genericMethodsPigeon = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Raven> genericMethodsRaven = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Crocodile> genericMethodsCrocodile = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Maylily> genericMethodsMaylily = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rose> genericMethodsRose = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Chamomile> genericMethodsChamomile = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Potato> genericMethodsPotato = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Carrot> genericMethodsCarrot = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Radish> genericMethodsRadish = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Plane> genericMethodsPlane = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Copter> genericMethodsCopter = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rocket> genericMethodsRocket = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Car> genericMethodsCar = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Motorbike> genericMethodsMotorbike = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Moped> genericMethodsMoped = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Bottle> genericMethodsBottle = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mug> genericMethodsMug = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Can> genericMethodsCan = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Petrol> genericMethodsPetrol = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Diesel> genericMethodsDiesel = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Water> genericMethodsWater = new GenericMethodsInGenericClassT<>();

        genericMethodsString.genericMethodOneGenArg("Argument");
        System.out.println(genericMethodsString.genericMethodTwoGenArgs(" ", " "));
        genericMethodsString.genericMethodHalfGenArgs(" ", "Hello");

        genericMethodsInteger.genericMethodOneGenArg(10);
        System.out.println(genericMethodsInteger.genericMethodTwoGenArgs(5, 25));
        genericMethodsInteger.genericMethodHalfGenArgs(70, "Lion");

        genericMethodsDouble.genericMethodOneGenArg(50.5);
        System.out.println(genericMethodsDouble.genericMethodTwoGenArgs(11.283, 80.524));
        genericMethodsDouble.genericMethodHalfGenArgs(100.01, "Crocodile");

        genericMethodsBeetle.genericMethodOneGenArg(new Beetle(10, "Zhuck"));
        System.out.println(genericMethodsBeetle.genericMethodTwoGenArgs(new Beetle(1, "Mak"), new Beetle(2, "Usach")));
        genericMethodsBeetle.genericMethodHalfGenArgs(new Beetle(1, "Mark"), "giraffe");

        genericMethodsMosquito.genericMethodOneGenArg(new Mosquito(2, "Mosqui"));
        System.out.println(genericMethodsMosquito.genericMethodTwoGenArgs(new Mosquito(5, "Jack"), new Mosquito(2, "Jorzh")));
        genericMethodsMosquito.genericMethodHalfGenArgs(new Mosquito(1, "Bob"), "elephant");

        genericMethodsFly.genericMethodOneGenArg(new Fly(3, "Rob"));
        System.out.println(genericMethodsFly.genericMethodTwoGenArgs(new Fly(5, "Domestica Flyable"), new Fly(2, "Neel")));
        genericMethodsFly.genericMethodHalfGenArgs(new Fly(4, "Nick"), "table");

        genericMethodsPigeon.genericMethodOneGenArg(new Pigeon(3, "Oliver"));
        System.out.println(genericMethodsPigeon.genericMethodTwoGenArgs(new Pigeon(5, "Harry"), new Pigeon(2, "Jacob")));
        genericMethodsPigeon.genericMethodHalfGenArgs(new Pigeon(4, "Charley"), "telephone");

        genericMethodsRaven.genericMethodOneGenArg(new Raven(11, "Thomas"));
        System.out.println(genericMethodsRaven.genericMethodTwoGenArgs(new Raven(4, "George"), new Raven(2, "James")));
        genericMethodsRaven.genericMethodHalfGenArgs(new Raven(10, "Oscar"), "telephone");

        genericMethodsCrocodile.genericMethodOneGenArg(new Crocodile(100, "Noah"));
        System.out.println(genericMethodsCrocodile.genericMethodTwoGenArgs(new Crocodile(107, "Alexander"), new Crocodile(200, "Connor ")));
        genericMethodsCrocodile.genericMethodHalfGenArgs(new Crocodile(110, "Michael"), "telephone");

        genericMethodsMaylily.genericMethodOneGenArg(new Maylily(12, "Melanie"));
        System.out.println(genericMethodsMaylily.genericMethodTwoGenArgs(new Maylily(20, "Victoria"), new Maylily(7, "Rebecca")));
        genericMethodsMaylily.genericMethodHalfGenArgs(new Maylily(14, "Barbara"), "telephone");

        genericMethodsRose.genericMethodOneGenArg(new Rose(12, "Анжелик"));
        System.out.println(genericMethodsRose.genericMethodTwoGenArgs(new Rose(20, "Афина"), new Rose(4, "Сония")));
        genericMethodsRose.genericMethodHalfGenArgs(new Rose(18, "Ностальжи"), "telephone");

        genericMethodsChamomile.genericMethodOneGenArg(new Chamomile(12, "Стефания"));
        System.out.println(genericMethodsChamomile.genericMethodTwoGenArgs(new Chamomile(20, "Римская"), new Chamomile(7, "Крейзи Дейзи")));
        genericMethodsChamomile.genericMethodHalfGenArgs(new Chamomile(14, "Вирал Суприм"), "set");

        genericMethodsPotato.genericMethodOneGenArg(new Potato(54, "Аврора"));
        System.out.println(genericMethodsPotato.genericMethodTwoGenArgs(new Potato(74, "Адретта"), new Potato(76, "Белоснежка")));
        genericMethodsPotato.genericMethodHalfGenArgs(new Potato(88, "Альбатрос"), "grandfather");

        genericMethodsCarrot.genericMethodOneGenArg(new Carrot(12, "Амстердамская"));
        System.out.println(genericMethodsCarrot.genericMethodTwoGenArgs(new Carrot(20, "Тушон"), new Carrot(7, "Парижская каротель")));
        genericMethodsCarrot.genericMethodHalfGenArgs(new Carrot(14, "Оранжевый мускат"), "nephew");

        genericMethodsRadish.genericMethodOneGenArg(new Radish(100, "Донар F1"));
        System.out.println(genericMethodsRadish.genericMethodTwoGenArgs(new Radish(85, "Рампух"), new Radish(51, "Чемпион")));
        genericMethodsRadish.genericMethodHalfGenArgs(new Radish(77, "Рондеел"), "parents");

        genericMethodsPlane.genericMethodOneGenArg(new Plane(154646444, "Fokker"));
        System.out.println(genericMethodsPlane.genericMethodTwoGenArgs(new Plane(131313430, "Ан-12"), new Plane(435312131, "Ил-114")));
        genericMethodsPlane.genericMethodHalfGenArgs(new Plane(1312345344, "Ли-2"), "address");

        genericMethodsCopter.genericMethodOneGenArg(new Copter(14500000, "Ми-38"));
        System.out.println(genericMethodsCopter.genericMethodTwoGenArgs(new Copter(85964444, "Ка-62"), new Copter(765463411, "Ка-226Т")));
        genericMethodsCopter.genericMethodHalfGenArgs(new Copter(467676784, "Bell 206B Jet Ranger"), "Person");

        genericMethodsRocket.genericMethodOneGenArg(new Rocket(50000, " Black Brant"));
        System.out.println(genericMethodsRocket.genericMethodTwoGenArgs(new Rocket(10000, "Victoria"), new Rocket(45000, "Союз-2.1а")));
        genericMethodsRocket.genericMethodHalfGenArgs(new Rocket(200001, "Союз ТМА-3"), "school");

        genericMethodsCar.genericMethodOneGenArg(new Car(12, "Aston Martin"));
        System.out.println(genericMethodsCar.genericMethodTwoGenArgs(new Car(20, "Ferrari"), new Car(7, "Rolls-Royce")));
        genericMethodsCar.genericMethodHalfGenArgs(new Car(14, "Acura"), "question");

        genericMethodsMotorbike.genericMethodOneGenArg(new Motorbike(12, "Ducati"));
        System.out.println(genericMethodsMotorbike.genericMethodTwoGenArgs(new Motorbike(20, "Dodge Tomahawk"), new Motorbike(7, "Ninja")));
        genericMethodsMotorbike.genericMethodHalfGenArgs(new Motorbike(14, "Suzuki"), "especially");

        genericMethodsMoped.genericMethodOneGenArg(new Moped(1000, "Yamaha"));
        System.out.println(genericMethodsMoped.genericMethodTwoGenArgs(new Moped(1500, "Lifan"), new Moped(2000, "Irbis")));
        genericMethodsMoped.genericMethodHalfGenArgs(new Moped(1100, "Racer"), "family");

        genericMethodsBottle.genericMethodOneGenArg(new Bottle(12, "My bottle"));
        System.out.println(genericMethodsBottle.genericMethodTwoGenArgs(new Bottle(20, "BBottle"), new Bottle(7, "Bottle2")));
        genericMethodsBottle.genericMethodHalfGenArgs(new Bottle(14, "Barbara"), "language");

        genericMethodsMug.genericMethodOneGenArg(new Mug(15, "My Mug"));
        System.out.println(genericMethodsMug.genericMethodTwoGenArgs(new Mug(12, "Muggi"), new Mug(7, "Mug2")));
        genericMethodsMug.genericMethodHalfGenArgs(new Mug(14, "Barbara"), "people");

        genericMethodsCan.genericMethodOneGenArg(new Can(17, "1L"));
        System.out.println(genericMethodsCan.genericMethodTwoGenArgs(new Can(20, "2L"), new Can(4, "1,5L")));
        genericMethodsCan.genericMethodHalfGenArgs(new Can(19, "3L"), "plant");

        genericMethodsPetrol.genericMethodOneGenArg(new Petrol());
        System.out.println(genericMethodsPetrol.genericMethodTwoGenArgs(new Petrol(), new Petrol()));
        genericMethodsPetrol.genericMethodHalfGenArgs(new Petrol(), "АИ-95");

        genericMethodsDiesel.genericMethodOneGenArg(new Diesel());
        System.out.println(genericMethodsDiesel.genericMethodTwoGenArgs(new Diesel(), new Diesel()));
        genericMethodsDiesel.genericMethodHalfGenArgs(new Diesel(), "ДДТ");

        genericMethodsWater.genericMethodOneGenArg(new Water());
        System.out.println(genericMethodsWater.genericMethodTwoGenArgs(new Water(), new Water()));
        genericMethodsWater.genericMethodHalfGenArgs(new Water(), "number");
    }
}
