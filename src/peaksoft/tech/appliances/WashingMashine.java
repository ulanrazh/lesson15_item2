package peaksoft.tech.appliances;

import java.time.LocalDate;

public class WashingMashine extends Appliances {
    private String typeOfAutomate;
    private String display;

    //CONSTRUCTOR WITHOUT ARGUMENTS
    
    public WashingMashine(String nameTech, String colorTech, double mass, double price, LocalDate createdDate, int volumeApp,
                          String classEnergy, String typeOfAutomate, String display) {
        super(nameTech, colorTech, mass, price, createdDate, volumeApp, classEnergy);
        this.typeOfAutomate = typeOfAutomate;
        this.display = display;
    }

    public String getTypeOfAutomate() {
        return typeOfAutomate;
    }

    public void setTypeOfAutomate(String typeOfAutomate) {
        this.typeOfAutomate = typeOfAutomate;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "WashingMashine{" +
                "typeOfAutomate='" + typeOfAutomate + '\'' +
                ", display='" + display + '\'' +
                "} " + super.toString();
    }
}
