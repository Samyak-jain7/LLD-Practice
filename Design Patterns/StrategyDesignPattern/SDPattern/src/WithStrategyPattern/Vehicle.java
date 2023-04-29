package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObj;
    // Constructor Injection
    Vehicle(DriveStrategy driveObj) {
        this.driveObj = driveObj;
    }
    public void drive() {
        driveObj.drive();
    }
}
