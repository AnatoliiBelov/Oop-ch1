public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String contry;

    public Car(double engineVolume, int year) {

        this("default", "default", engineVolume, "белый", year, "default");
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        if (year <= 0) {
            this.year = 2000;
        }
    }
public Car(){
    if (brand == "" || brand == null) {
        brand = "default";
    }
    if (model == "" || model == null) {
        model = "default";
    }
    if (contry == "" || contry == null) {
        contry = "default";
    }
    if (engineVolume <= 0) {
        engineVolume = 1.5;
    }
    if (color == "" || color == null) {
        color = "белый";
    }
    if (year <= 0) {
        year = 2000;
    }
}
    public Car(String brand, double engineVolume, int year) {

        this(brand, "default", engineVolume, "белый", year, "default");
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        if (year <= 0) {
            this.year = 2000;
        }
        if (brand == "" || brand == null) {
            this.brand = "default";
        }
    }


    public Car(String brand, String model, double engineVolume, String color, int year, String contry) {
        if (brand == "" || brand == null) {
            brand = "default";
        }
        if (model == "" || model == null) {
            model = "default";
        }
        if (contry == "" || contry == null) {
            contry = "default";
        }
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        if (color == "" || color == null) {
            color = "белый";
        }
        if (year <= 0) {
            year = 2000;
        }
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.contry = contry;

    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " год выпуска, " + color + " цвет кузова, сборка в " + contry + ", объем двигателя " + engineVolume + " л.";
    }
}
