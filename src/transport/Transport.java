package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String contry;
    private String color;
    private int maxSpeed;
    public String DEFAULT_OPTIONS_FOR_BRAND_MODEL_COUNTRY = "default";
    public int DEFAULT_OPTIONS_FOR_YEAR = 2000;
    public int DEFAULT_OPTIONS_FOR_MAX_SPEED = 180;
    public String DEFAULT_OPTIONS_FOR_COLOR = "белый";


    public Transport(String brand, String model, int year, String contry, String color, int maxSpeed) {
        if (brand.isBlank()) {
            brand = DEFAULT_OPTIONS_FOR_BRAND_MODEL_COUNTRY;
        }
        if (model.isBlank()) {
            model = DEFAULT_OPTIONS_FOR_BRAND_MODEL_COUNTRY;
        }
        if (contry.isBlank()) {
            contry = DEFAULT_OPTIONS_FOR_BRAND_MODEL_COUNTRY;
        }
        if (year <= 1900) {
            year = DEFAULT_OPTIONS_FOR_YEAR;
        }
        if (maxSpeed <= 100) {
            maxSpeed = DEFAULT_OPTIONS_FOR_MAX_SPEED;
        }
        if (color.isBlank()) {
            color = DEFAULT_OPTIONS_FOR_COLOR;
        }
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.contry = contry;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getContry() {
        return contry;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getYear() + " год выпуска, " + getMaxSpeed() + "-максимальная скорость, " + getColor() + " цвет кузова, сборка в " + getContry();
    }
}
