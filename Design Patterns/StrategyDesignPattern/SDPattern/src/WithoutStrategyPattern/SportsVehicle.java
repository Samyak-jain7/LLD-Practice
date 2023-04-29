package WithoutStrategyPattern;

public class SportsVehicle extends Vehicle{
    @Override
    public void drive() {
//        super.drive();
        System.out.println("Sports drive capability");
    }
}
