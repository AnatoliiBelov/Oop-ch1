package transport;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private final double engineVolume;
    public final double DEFAULT_OPTIONS_FOR_ENGINE_VOLUME = 1.5;

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

    public abstract void start();

    public abstract void finish();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
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
    public String toString() {
        return getBrand() + " " + getModel() + ", " + "объём двигателя: " + getEngineVolume();
    }
}
