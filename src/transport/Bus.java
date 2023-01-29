package transport;

public class Bus extends Transport<DriverBusD> implements Competing {


    public Bus(String brand, String model, double engineVolume, DriverBusD driverBusD) {
        super(brand, model, engineVolume, driverBusD);
    }

    @Override
    public void start() {
        System.out.println("завести двигатель");
        System.out.println("провести специальные процедуры для автобусов");
        System.out.println("проверить все системы авто");
        System.out.println("Нажать сцепление и газ");
    }

    @Override
    public void finish() {
        System.out.println("Полная остановка авто");
        System.out.println("провести специальные процедуры для автобусов");


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
