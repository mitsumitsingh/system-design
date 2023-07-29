package sumit.lld.strategypattern.solution;

import sumit.lld.strategypattern.solution.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
