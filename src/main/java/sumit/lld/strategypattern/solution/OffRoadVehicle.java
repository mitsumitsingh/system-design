package sumit.lld.strategypattern.solution;

import sumit.lld.strategypattern.solution.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
