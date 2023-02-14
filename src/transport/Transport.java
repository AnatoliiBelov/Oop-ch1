package transport;


import Driver.Driver;
import TransportExeption.BusNotPassDiagnosticsException;
import TransportExeption.DriverCannotBeWithoutADriversLicenseException;
import mechanic.Mechanic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private final double engineVolume;
    public final double DEFAULT_OPTIONS_FOR_ENGINE_VOLUME = 1.5;
    private final List<Mechanic> listOfMechanics = new ArrayList<>();


    //    private final int year;
//    private final String contry;
//    private String color;
//    private int maxSpeed;
    public final String DEFAULT_OPTIONS_FOR_BRAND_MODEL_COUNTRY = "default";
    private final T driver;


//    public int DEFAULT_OPTIONS_FOR_YEAR = 2000;
//    public int DEFAULT_OPTIONS_FOR_MAX_SPEED = 180;
//    public String DEFAULT_OPTIONS_FOR_COLOR = "белый";


    public T getDriver() {
        return driver;
    }

    public Transport(String brand, String model, double engineVolume, T driver) {
        if (brand.isBlank() || brand == null) {
            brand = DEFAULT_OPTIONS_FOR_BRAND_MODEL_COUNTRY;
        }
        if (model.isBlank() || model == null) {
            model = DEFAULT_OPTIONS_FOR_BRAND_MODEL_COUNTRY;
        }
        if (engineVolume <= 0) {
            engineVolume = DEFAULT_OPTIONS_FOR_ENGINE_VOLUME;
        }
//        if (contry.isBlank()) {
//            contry = DEFAULT_OPTIONS_FOR_BRAND_MODEL_COUNTRY;
//        }
//        if (year <= 1900) {
//            year = DEFAULT_OPTIONS_FOR_YEAR;
//        }
//        if (maxSpeed <= 100) {
//            maxSpeed = DEFAULT_OPTIONS_FOR_MAX_SPEED;
//        }
//        if (color.isBlank()) {
//            color = DEFAULT_OPTIONS_FOR_COLOR;
//        }
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.driver = driver;
//        this.year = year;
//        this.contry = contry;
//        this.color = color;
//        this.maxSpeed = maxSpeed;

    }
public abstract void passDiagnostics() throws BusNotPassDiagnosticsException;
    public abstract void start();

    public abstract void finish();
    public abstract void printType();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public List<Mechanic> getListOfMechanics() {
        return listOfMechanics;
    }
    public void addMechanic(Mechanic mechanic  ){
        listOfMechanics.add(mechanic);

    }
    //    public int getYear() {
//        return year;
//    }
//
//    public String getContry() {
//        return contry;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public void setMaxSpeed(int maxSpeed) {
//        this.maxSpeed = maxSpeed;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(driver, transport.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver);
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + "объём двигателя: " + getEngineVolume();
    }
}
