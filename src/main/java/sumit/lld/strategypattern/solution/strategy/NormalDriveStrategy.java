package sumit.lld.strategypattern.solution.strategy;

import sumit.lld.strategypattern.solution.strategy.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }
}
