package transport;

public class DriverBusD extends Driver {
    public DriverBusD(String fullName, boolean driversLicence, int driverExperience) {
        super(fullName, driversLicence, driverExperience);
    }

    @Override
    public void start() {
        {
            System.out.println("завести двигатель");
            System.out.println("проверить все системы авто");
            System.out.println("Нажать сцепление и газ");
            System.out.println("Водитель " + getFullName() + " категории D тронулся в путь");
        }

    }

    @Override
    public void finish() {
        {
            System.out.println("Водитель " + getFullName() + " категории D остановился");

        }
    }

    @Override
    public void refuel() {
        {
            System.out.println("Водитель " + getFullName() + " категории D заправил авто");

        }

    }
}
