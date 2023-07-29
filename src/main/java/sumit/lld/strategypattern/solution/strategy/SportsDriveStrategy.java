package sumit.lld.strategypattern.solution.strategy;

import sumit.lld.strategypattern.solution.strategy.DriveStrategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sports Drive Capability");
    }
}
