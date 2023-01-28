package transport;

public class DriverTruckС extends Driver {
    public DriverTruckС(String fullName, boolean driversLicence, int driverExperience) {
        super(fullName, driversLicence, driverExperience);
    }

    @Override
    public void start() {
        {
            System.out.println("завести двигатель");
            System.out.println("проверить все системы авто");
            System.out.println("Нажать сцепление и газ");
            System.out.println("Водитель "+getFullName()+" категории С тронулся в путь");
        }

    }

    @Override
    public void finish() {
        {
            System.out.println("Водитель "+getFullName()+" категории С остановился");

        }
    }

    @Override
    public void refuel() {
        {
            System.out.println("Водитель "+getFullName()+" категории С заправил авто");

        }

    }
}
