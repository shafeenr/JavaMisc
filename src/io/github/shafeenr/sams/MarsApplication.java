package io.github.shafeenr.sams;

public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();
        spirit.status = "exploring";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttributes();
        System.out.println("Increasing speed to 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Changing temperature to -90");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Checking temperature.");
        spirit.checkTemperature();
        spirit.showAttributes();

        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "exploring";
        opportunity.speed = 4;
        opportunity.temperature = 20;
        opportunity.showAttributes();
    }
}
