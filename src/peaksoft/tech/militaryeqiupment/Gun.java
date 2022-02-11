package peaksoft.tech.militaryeqiupment;

public class Gun extends MilitaryEquipment {
    private String typeOfBullet;
    
    //DEFINE CONSTRUCTOR WITHOUT ARGUMENTS

    public Gun(String nameTech, String colorTech, double mass, double price, int firingRange, String material, String typeOfBullet) {
        super(nameTech, colorTech, mass, price, firingRange, material);
        this.typeOfBullet = typeOfBullet;
    }

    public String getTypeOfBullet() {
        return typeOfBullet;
    }

    public void setTypeOfBullet(String typeOfBullet) {
        this.typeOfBullet = typeOfBullet;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "typeOfBullet='" + typeOfBullet + '\'' +
                "} " + super.toString();
    }
}
