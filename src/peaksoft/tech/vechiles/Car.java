package peaksoft.tech.vechiles;

import peaksoft.tech.Tech;

import java.time.LocalDate;

public class Car extends Vechiles {
    private String steeringWheel;

    public Car(String nameTech, String colorTech, double mass, double price, String typeTransort, String markTransport, int speed, int mileage, LocalDate manufactorDate, String steeringWheel) {
        super(nameTech, colorTech, mass, price, typeTransort, markTransport, speed, mileage, manufactorDate);
        this.steeringWheel = steeringWheel;
    }

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "steeringWheel='" + steeringWheel + '\'' +
                "} " + super.toString();
    }
}

