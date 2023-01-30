package transport;


public class Car extends Transport<DriverCarB> implements Competing {
    bodyType bodyType;
    public enum bodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        STATION_WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP_TRUCK("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private String bodyTypeOnRussian;

        @Override
        public String toString() {
            return "Тип кузова: " + bodyTypeOnRussian;
        }

        bodyType(String bodyTypeOnRussian) {
            this.bodyTypeOnRussian = bodyTypeOnRussian;
        }

        public String getBodyTypeOnRussian() {
            return bodyTypeOnRussian;
        }
    }

//    private double engineVolume;
//
//    private String transmission;
//    private final String bodyType;
//    private String registrationNumber;
//    private final int numberOfSeats;
//    private boolean tiresType;//false-летняя резина, true-зимняя

//
//    public String DEFAULT_OPTIONS_FOR_TRANSMISSION = "механическая";
//    public String DEFAULT_OPTIONS_FOR_BODY_TYPE = "седан";
//    public String DEFAULT_OPTIONS_FOR_BODY_REGISTRATION_NUMBER = "х000хх000";
//    public int DEFAULT_OPTIONS_FOR_BODY_NUMBER_OF_SEATS = 5;
//    public boolean DEFAULT_OPTIONS_FOR_REMOTE_ENGINE_START = false;
//    public boolean DEFAULT_OPTIONS_FOR_KEYLESS_ACCESS = false;


//    public class Key {
//        private final boolean remoteEngineStart;
//        private final boolean keylessAccess;
//
//        public Key(boolean remoteEngineStart, boolean keylessAccess) {
//            this.remoteEngineStart = remoteEngineStart;
//            this.keylessAccess = keylessAccess;
//        }
//
//        public boolean isRemoteEngineStart() {
//            return remoteEngineStart;
//        }
//
//        public boolean isKeylessAccess() {
//            return keylessAccess;
//        }
//    }

    public Car(String brand, String model, double engineVolume, DriverCarB driverCarB) {
        super(brand, model, engineVolume, driverCarB);

//        if (engineVolume <= 0) {
//            engineVolume = 1.5;
//        }
//
//
//        if (transmission.isBlank()) {
//            transmission = DEFAULT_OPTIONS_FOR_TRANSMISSION;
//        }
//        if (bodyType.isBlank()) {
//            bodyType = DEFAULT_OPTIONS_FOR_BODY_TYPE;
//        }
//        if (registrationNumber.isEmpty()) {
//            registrationNumber = DEFAULT_OPTIONS_FOR_BODY_REGISTRATION_NUMBER;
//        }
//        if (numberOfSeats <= 0) {
//            numberOfSeats = DEFAULT_OPTIONS_FOR_BODY_NUMBER_OF_SEATS;
//        }
//        this.engineVolume = engineVolume;
//        this.transmission = transmission;
//        this.bodyType = bodyType;
//        this.registrationNumber = registrationNumber;
//        this.numberOfSeats = numberOfSeats;
//        this.tiresType = tiresType;
    }

    @Override
    public void passDiagnostics() {
        System.out.println("авто "+Car.this.getBrand()+" "+Car.this.getModel()+" проходит диагностику");


    }


    public Car.bodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(Car.bodyType bodyType) {
        this.bodyType = bodyType;
    }
    @Override
    public void printType() {
        if (bodyType==null){
            System.out.println("Данных по транспортному средству недостаточно");
        }else {
            System.out.println(bodyType);}
    }
    @Override
    public void start() {
        System.out.println("завести двигатель");
        System.out.println("провести специальные процедуры легковых авто");
        System.out.println("проверить все системы авто");
        System.out.println("Нажать сцепление и газ");
    }

    @Override
    public void finish() {
        System.out.println("Полная остановка авто");
        System.out.println("провести специальные процедуры легковых авто");
    }

    @Override
    public void goToPitStop() {
        System.out.println("найти поломку");
        System.out.println("Исправить поломку");

    }

    @Override
    public void fixBestLapTime(String time) {
        System.out.println("лучшее время круга: " + time);


    }

    @Override
    public void fixMaxSpeed(double maxSpeed) {
        System.out.println("максимальная скорость: " + maxSpeed);
    }


//
//    public void changeOfTires(int month) {
//
//
//        if (month >= 4 && month <= 10) {
//            this.tiresType = false;
//            System.out.println("Резина летняя");
//        } else {
//            this.tiresType = true;
//            System.out.println("Резина зимняя");
//        }
//
//    }


//    public double getEngineVolume() {
//        return engineVolume;
//    }
//
//    public String getTransmission() {
//        return transmission;
//    }
//
//    public String getBodyType() {
//        return bodyType;
//    }
//
//    public String getRegistrationNumber() {
//        return registrationNumber;
//    }
//
//    public int getNumberOfSeats() {
//        return numberOfSeats;
//    }
//
//    public boolean isTiresType() {
//        return tiresType;
//    }
//
//    public void setEngineVolume(double engineVolume) {
//        this.engineVolume = engineVolume;
//    }
//
//
//    public void setTransmission(String transmission) {
//        this.transmission = transmission;
//    }
//
//    public void setRegistrationNumber(String registrationNumber) {
//        this.registrationNumber = registrationNumber;
//    }
//
//    public void setTiresType(boolean tiresType) {


//        this.tiresType = tiresType;
//    }

//    @Override
//    public String toString() {
//        return getBrand() + " " + getModel() + ", " + getYear() + " год выпуска, " + getMaxSpeed() + "-максимальная скорость, " + getColor() + " цвет кузова, сборка в " + getContry() + ", объем двигателя " + engineVolume + " л.," + "коробка передач-" + transmission + ", Тип кузова-" + bodyType + ", регистрационный номер " + registrationNumber + ", количество мест-" + numberOfSeats + ", тип резины-" + tiresType + ", пояснение:false-летняя резина, true-зимняя";
//    }
}
