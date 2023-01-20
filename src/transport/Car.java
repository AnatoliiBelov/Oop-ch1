package transport;


public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String contry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean tiresType;//false-летняя резина, true-зимняя
    public String DEFAULT_OPTIONS_FOR_BRAND_MODEL_COUNTRY = "default";
    public String DEFAULT_OPTIONS_FOR_COLOR = "белый";
    public int DEFAULT_OPTIONS_FOR_YEAR = 2000;
    public String DEFAULT_OPTIONS_FOR_TRANSMISSION = "механическая";
    public String DEFAULT_OPTIONS_FOR_BODY_TYPE = "седан";
    public String DEFAULT_OPTIONS_FOR_BODY_REGISTRATION_NUMBER = "х000хх000";
    public int DEFAULT_OPTIONS_FOR_BODY_NUMBER_OF_SEATS = 5;
    public boolean DEFAULT_OPTIONS_FOR_REMOTE_ENGINE_START = false;
    public boolean DEFAULT_OPTIONS_FOR_KEYLESS_ACCESS = false;


    public class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }


    public Car(String brand, String model, double engineVolume, String color, int year, String contry, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean tiresType) {
        if (brand.isBlank()) {
            brand = DEFAULT_OPTIONS_FOR_BRAND_MODEL_COUNTRY;
        }
        if (brand.isBlank()) {
            model = DEFAULT_OPTIONS_FOR_BRAND_MODEL_COUNTRY;
        }
        if (brand.isBlank()) {
            contry = DEFAULT_OPTIONS_FOR_BRAND_MODEL_COUNTRY;
        }
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        if (brand.isBlank()) {
            color = DEFAULT_OPTIONS_FOR_COLOR;
        }
        if (year <= 0) {
            year = DEFAULT_OPTIONS_FOR_YEAR;
        }
        if (brand.isBlank()) {
            transmission = DEFAULT_OPTIONS_FOR_TRANSMISSION;
        }
        if (brand.isBlank()) {
            bodyType = DEFAULT_OPTIONS_FOR_BODY_TYPE;
        }
        if (brand.isBlank()) {
            registrationNumber = DEFAULT_OPTIONS_FOR_BODY_REGISTRATION_NUMBER;
        }
        if (numberOfSeats <= 0) {
            numberOfSeats = DEFAULT_OPTIONS_FOR_BODY_NUMBER_OF_SEATS;
        }


        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.contry = contry;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;

    }

    public void changeOfTires(int month) {


        if (month >= 4 && month <= 10) {
            this.tiresType = false;
            System.out.println("Резина летняя");
        } else {
            this.tiresType = true;
            System.out.println("Резина зимняя");
        }

    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getContry() {
        return contry;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isTiresType() {
        return tiresType;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setTiresType(boolean tiresType) {
        this.tiresType = tiresType;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " год выпуска, " + color + " цвет кузова, сборка в " + contry + ", объем двигателя " + engineVolume + " л.," + "коробка передач-" + transmission + ", Тип кузова-" + bodyType + ", регистрационный номер " + registrationNumber + ", количество мест-" + numberOfSeats + ", тип резины-" + tiresType + ", пояснение:false-летняя резина, true-зимняя";
    }
}
