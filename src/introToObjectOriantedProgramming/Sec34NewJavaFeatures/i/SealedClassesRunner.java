package introToObjectOriantedProgramming.Sec34NewJavaFeatures.i;

public class SealedClassesRunner {
    sealed class Vehicle permits Car, Bike, Truck {}

    final class Car extends Vehicle{};
    sealed class Bike extends Vehicle permits ElectricBike {};
    non-sealed class Truck extends Vehicle{};
    //class Dummy extends Vehicle{};

    final class ElectricBike extends Bike{};

    sealed interface Flyable permits Bird, Plane, Helicoptre{};

    final class Bird implements Flyable{};
    sealed  class Plane implements Flyable permits Airbus{};
    non-sealed class Helicoptre implements Flyable{};

    final class Airbus extends Plane{};

    public static void main(String[] args) {

    }
}
