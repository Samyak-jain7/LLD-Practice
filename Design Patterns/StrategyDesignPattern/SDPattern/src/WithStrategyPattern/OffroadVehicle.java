package WithStrategyPattern;

import WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffroadVehicle extends Vehicle{

    OffroadVehicle() {
        super(new SportsDriveStrategy());
    }
}
