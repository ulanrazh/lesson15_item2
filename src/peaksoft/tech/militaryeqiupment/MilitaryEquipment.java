package peaksoft.tech.militaryeqiupment;

import peaksoft.tech.Tech;

public class MilitaryEquipment extends Tech {
    private int firingRange;
    private String material;

    public MilitaryEquipment(String nameTech, String colorTech, double mass, double price, int firingRange, String material) {
        super(nameTech, colorTech, mass, price);
        this.firingRange = firingRange;
        this.material = material;
    }

    public int getFiringRange() {
        return firingRange;
    }

    public void setFiringRange(int firingRange) {
        this.firingRange = firingRange;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "MilitaryEquipment{" +
                "firingRange=" + firingRange +
                ", material='" + material + '\'' +
                "} " + super.toString();
    }
}
