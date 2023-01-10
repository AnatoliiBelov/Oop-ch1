public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String contry;

    @Override
    public String toString() {
        return brand+" "+model+", "+year+" год выпуска, "+color+" цвет кузова, сборка в "+contry+", объем двигателя "+engineVolume+" л.";
    }
}
