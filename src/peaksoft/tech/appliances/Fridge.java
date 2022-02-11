package peaksoft.tech.appliances;

import java.time.LocalDate;

public class Fridge extends Appliances {
    private String levelnoise;
    
    //CONSTRUCTORS WITHOUT ARGUMENTS

    public Fridge(String nameTech, String colorTech, double mass, double price, LocalDate createdDate, int volumeApp, String classEnergy, String levelnoise) {
        super(nameTech, colorTech, mass, price, createdDate, volumeApp, classEnergy);
        this.levelnoise = levelnoise;
    }

    public String getLevelnoise() {
        return levelnoise;
    }

    public void setLevelnoise(String levelnoise) {
        this.levelnoise = levelnoise;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "levelnoise='" + levelnoise + '\'' +
                "} " + super.toString();
    }
}
