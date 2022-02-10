package peaksoft.tech.vechiles;

import peaksoft.tech.Tech;

import java.time.LocalDate;

public class Vechiles extends Tech {
    private String typeTransort;
    private String markTransport;
    private int speed;
    private int mileage;
    private LocalDate manufactorDate;

    public Vechiles(String nameTech, String colorTech, double mass, double price, String typeTransort,
                    String markTransport, int speed, int mileage, LocalDate manufactorDate) {
        super(nameTech, colorTech, mass, price);
        this.typeTransort = typeTransort;
        this.markTransport = markTransport;
        this.speed = speed;
        this.mileage = mileage;
        this.manufactorDate = manufactorDate;
    }

    public String getTypeTransort() {
        return typeTransort;
    }

    public void setTypeTransort(String typeTransort) {
        this.typeTransort = typeTransort;
    }

    public String getMarkTransport() {
        return markTransport;
    }

    public void setMarkTransport(String markTransport) {
        this.markTransport = markTransport;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public LocalDate getManufactorDate() {
        return manufactorDate;
    }

    public void setManufactorDate(LocalDate manufactorDate) {
        this.manufactorDate = manufactorDate;
    }


    @Override
    public String toString() {
        return "Vechiles{" +
                "typeTransort='" + typeTransort + '\'' +
                ", markTransport='" + markTransport + '\'' +
                ", speed=" + speed +
                ", mileage=" + mileage +
                ", manufactorDate=" + manufactorDate +
                "} " + super.toString();
    }
}
