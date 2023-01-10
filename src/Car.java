public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String contry;

    public Car(String brand, String model, double engineVolume, String color, int year, String contry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.contry = contry;
    }

    @Override
    public String toString() {
        return brand+" "+model+", "+year+" год выпуска, "+color+" цвет кузова, сборка в "+contry+", объем двигателя "+engineVolume+" л.";
    }
}
