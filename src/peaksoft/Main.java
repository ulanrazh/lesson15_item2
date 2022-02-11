package peaksoft;

import peaksoft.tech.Tech;
import peaksoft.tech.appliances.Appliances;
import peaksoft.tech.appliances.Fridge;
import peaksoft.tech.appliances.WashingMashine;
import peaksoft.tech.militaryeqiupment.Gun;
import peaksoft.tech.militaryeqiupment.MilitaryEquipment;
import peaksoft.tech.militaryeqiupment.Tank;
import peaksoft.tech.vechiles.Car;
import peaksoft.tech.vechiles.Truck;
import peaksoft.tech.vechiles.Vechiles;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Tech bmw1 = new Car("My vechile1","blue",1900,55000,"Electrical","BMW",250,15000,
                LocalDate.of(2015,5,25),"Left");
        Vechiles bmw2 = new Car("My car","Red",1800,35000,"Light","Mazda",240,25000,
                LocalDate.of(2021,8,25),"Right");
        Car bmw3 = new Car("My favourite car","Blue",2100,105000,"Sport","Mazerati",340,2000,
                LocalDate.of(2022,1,25),"Left");
        System.out.println(bmw1);
        System.out.println(bmw2);
        System.out.println(bmw3);

        Tech truck1 = new Truck("Truck","Yellow",4500,65000,"Off-road","Nissan",180,25000,
                LocalDate.of(2020,2,25),"Left","Diesel");
        Vechiles truck2 = new Truck("Mountain Truck","Purple",5500,75000,"Off-road","Tesla",250,18000,
                LocalDate.of(2021,6,2),"Left","Electrical");
        Truck truck3 = new Truck("Road Truck","Black",4200,55000,"Off-road","Audi",150,35000,
                LocalDate.of(2019,7,15),"Left","Diesel");
        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);

        Tech tank1 = new Tank("Tornada","Green",25000,650000,15000,"Titanium","HeavyTank");
        MilitaryEquipment tank2 = new Tank("Armogedon","Green",25000,650000,15000,"Titanium","HeavyTank");
        Tank tank3 = new Tank("T134","Green",25000,650000,15000,"Titanium","LightTank");

        System.out.println(tank1);
        System.out.println(tank2);
        System.out.println(tank3);

        Tech gun1 = new Gun("AK47","Brown",26,85000,3500,"Iron","long");
        MilitaryEquipment gun2 = new Gun("Machine gun","Black blue",86,125000,2800,"Titanium","Heavy");
        Gun gun3 = new Gun("Pistol","Black",5,5000,1500,"Iron","small");
        System.out.println(gun1);
        System.out.println(gun2);
        System.out.println(gun3);

        Tech wmachine = new WashingMashine("Samsung","Green",25.0,12000,
                LocalDate.of(2021,8,8),18,"A+++","SemiAutomatic","big");
        Appliances wmachine2 = new WashingMashine("LG","Blue",25.0,12000,
                LocalDate.of(2021,8,8),18,"A+++","Automatic","");
        WashingMashine wmachine3 = new WashingMashine("Samsung","White",25.0,12000,
                LocalDate.of(2021,8,8),18,"A+++","Automatic","small");

        System.out.println(wmachine);
        System.out.println(wmachine2);
        System.out.println(wmachine3);

        Tech fridge1 = new Fridge("LG","White",35,16000,
                LocalDate.of(2021,8,25),135,"B++","AAA");
        Appliances fridge2 = new Fridge("Samsung","Grey",28,16000,
                LocalDate.of(2019,8,25),145,"C++","ADC");
        Fridge fridge3 = new Fridge("NW","Black",30,18000,
                LocalDate.of(2020,8,25),225,"A++","CCC");
        System.out.println(fridge1);
        System.out.println(fridge2);
        System.out.println(fridge3);
        
        //LOOKS SO GOOD
        // I'M PROUD OF YOU

    }
}
