package peaksoft.tech.appliances;

import peaksoft.tech.Tech;

import java.time.LocalDate;

public class Appliances extends Tech {
    private LocalDate createdDate;
    private int volumeApp;
    private String classEnergy;
    
    //CONSTRUCTOR WITHOUT ARGUMENTS

    public Appliances(String nameTech, String colorTech, double mass, double price, LocalDate createdDate, int volumeApp, String classEnergy) {
        super(nameTech, colorTech, mass, price);
        this.createdDate = createdDate;
        this.volumeApp = volumeApp;
        this.classEnergy = classEnergy;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public int getVolumeApp() {
        return volumeApp;
    }

    public void setVolumeApp(int volumeApp) {
        this.volumeApp = volumeApp;
    }

    public String getClassEnergy() {
        return classEnergy;
    }

    public void setClassEnergy(String classEnergy) {
        this.classEnergy = classEnergy;
    }

    @Override
    public String toString() {
        return "Appliances{" +
                "createdDate=" + createdDate +
                ", volumeApp=" + volumeApp +
                ", classEnergy='" + classEnergy + '\'' +
                "} " + super.toString();
    }
}

