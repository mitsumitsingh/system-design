package org.sumit.solidprinciple;

/**
 * L -> Liskov Substitution Principle
 *
 * If class B is subtype of class A, then we should be able to replace object of A with B
 * without breaking the behaviour of the program.
 *
 * Subclass should extend the capability of parent class, should not narrow it down.
 */

public class LiskovSubstitution {
}

interface Bike{
    void turnOnEngine();
    void noOfWheels();
}

class MoterCycle implements Bike{
    boolean isEngineTurnOn;
    int noOfWheels;
    @Override
    public void turnOnEngine() {
        // turn on the engine
        isEngineTurnOn = true;
    }

    @Override
    public void noOfWheels() {
        noOfWheels = 2;
    }
}

class Cycle implements Bike{
    boolean isEngineTurnOn;
    int noOfWheels;
    @Override
    public void turnOnEngine() {
        // Cycle doesn't have engine
        throw new RuntimeException("Cycle doesn't have engine");
    }

    @Override
    public void noOfWheels() {
        noOfWheels = 2;
    }
}

/**
 * In the above example, Cycle class is narrowing the feature of Bike. So, it's not a valid design.
 *
 * To solve that, in parent class we should put only generic methods and in child class we need to add the specific methods.
 *
 * Let's see with the example.
 */

interface Vehicle{
    void noOfWheels();
}

class EngineVehicle implements Vehicle {

    public void turnOnEngine() {
        // default implementation
    }

    @Override
    public void noOfWheels() {
        // Provide implementation
    }
}

class BiCycle implements Vehicle {
    @Override
    public void noOfWheels() {

    }
}

class MoterCycle1 extends EngineVehicle{
    public void turnOnEngine() {
        // Provide class specific implementation
    }

    @Override
    public void noOfWheels() {
        // Provide class specific implementation
    }
}

class Car extends EngineVehicle{
    public void turnOnEngine() {
        // Provide class specific implementation
    }

    @Override
    public void noOfWheels() {
        // Provide class specific implementation
    }
}

/**
 * Now we can replace the reference of Car with MoterCycle1, feature will work.
 *
 * Eg :-
 * Vehicle vehicle = new Car();
 * vehicle.noOfWheels();
 *
 *
 * If we replace new Car(); with new MoterCycle1();, still vehicle.noOfWheels() will work.
 *
 * Vehicle vehicle = new MoterCycle1();
 * vehicle.noOfWheels();
 */