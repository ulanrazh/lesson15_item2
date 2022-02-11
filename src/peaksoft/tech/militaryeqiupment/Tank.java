package peaksoft.tech.militaryeqiupment;

public class Tank extends MilitaryEquipment {
    private String massCategory;

    //DEFINE CONSTRUCTOR WITHOUT ARGUMENTS
    
    public Tank(String nameTech, String colorTech, double mass, double price, int firingRange, String material, String massCategory) {
        super(nameTech, colorTech, mass, price, firingRange, material);
        this.massCategory = massCategory;
    }

    public String getMassCategory() {
        return massCategory;
    }

    public void setMassCategory(String massCategory) {
        this.massCategory = massCategory;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "massCategory='" + massCategory + '\'' +
                "} " + super.toString();
    }
}
