package peaksoft.tech.vechiles;

import java.time.LocalDate;

public class Truck extends Car { //TRUCK SHOULD EXTEND VEHICLE.CLASS !! 
    private int volume;
    private String fuel;

    //DEFINE CONSTRUCTOR WITHOUT ARGUMENTS
    
    public Truck(String nameTech, String colorTech, double mass, double price, String typeTransort, String markTransport,
                 int speed, int mileage, LocalDate manufactorDate, String steeringWheel, String fuel) {
        super(nameTech, colorTech, mass, price, typeTransort, markTransport, speed, mileage, manufactorDate, steeringWheel);
        this.fuel = fuel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "volume=" + volume +
                ", fuel='" + fuel + '\'' +
                "} " + super.toString();
    }
}
