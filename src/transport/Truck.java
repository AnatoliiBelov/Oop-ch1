package transport;

public class Truck extends Transport<DriverTruckС> implements Competing {

    public Truck(String brand, String model, double engineVolume, DriverTruckС driverTruckС) {
        super(brand, model, engineVolume, driverTruckС);
    }


    @Override
    public void start() {
        System.out.println("завести двигатель");
        System.out.println("провести специальные процедуры для грузовиков");
        System.out.println("проверить все системы авто");
        System.out.println("Нажать сцепление и газ");

    }

    @Override
    public void finish() {
        System.out.println("Полная остановка авто");
        System.out.println("провести специальные процедуры для грузовиков");

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


}
