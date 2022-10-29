package hillel;

public class Car {
    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }
    private void startElectricity(){
        System.out.println("Start Energy");
    }
    private void startCommand(){
        System.out.println("Start Command");
    }
    private void startFuelSystem(){
        System.out.println("Fuel system full");
    }
}
