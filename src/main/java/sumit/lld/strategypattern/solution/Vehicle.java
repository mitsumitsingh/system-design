package sumit.lld.strategypattern.solution;

import sumit.lld.strategypattern.solution.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        this.driveStrategy.drive();
    }
}
