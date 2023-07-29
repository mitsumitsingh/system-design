In this example we have Vehicle class which is extended by the OffRoadVehicle, SportsVehicle and PassengerVehicle.

But the drive capability required in the OffRoadVehicle and SportsVehicle are same. So we need to implement save drive capability in both the class.

But as it's redundant code. We can solve this problem using strategy design patter, which will decide the drive capability at the runtime.