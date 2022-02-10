package peaksoft.tech;

public class Tech {
    //что-то общее

    private String nameTech;
    private String colorTech;
    private double mass;
    private double price;

    public Tech() {
    }

    public Tech(String nameTech, String colorTech, double mass, double price) {
        this.nameTech = nameTech;
        this.colorTech = colorTech;
        this.mass = mass;
        this.price = price;
    }

    public String getNameTech() {
        return nameTech;
    }

    public void setNameTech(String nameTech) {
        this.nameTech = nameTech;
    }

    public String getColorTech() {
        return colorTech;
    }

    public void setColorTech(String colorTech) {
        this.colorTech = colorTech;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tech{" +
                "nameTech='" + nameTech + '\'' +
                ", colorTech='" + colorTech + '\'' +
                ", mass=" + mass +
                ", price=" + price +
                '}';
    }
}
