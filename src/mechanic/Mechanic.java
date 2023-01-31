package mechanic;

import transport.Transport;

public class Mechanic {
    private final String name;

    private final String company;


    public void performMaintenance(Transport<?>transport) {
        System.out.println("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " проходит техобслуживание");
    }

    public void repearCar(Transport<?>transport){
        System.out.println("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " починен");
    }
    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }
    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Механик " + name+ " из компании " + company;
    }
}
