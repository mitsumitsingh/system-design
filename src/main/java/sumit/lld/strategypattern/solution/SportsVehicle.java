package sumit.lld.strategypattern.solution;

import sumit.lld.strategypattern.solution.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
