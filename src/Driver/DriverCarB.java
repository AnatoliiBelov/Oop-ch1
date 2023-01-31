package Driver;

import TransportExeption.DriverCannotBeWithoutADriversLicense;

public class DriverCarB extends Driver {
    public DriverCarB(String fullName, boolean driversLicence, int driverExperience) throws DriverCannotBeWithoutADriversLicense {
        super(fullName, driversLicence, driverExperience);
    }

    @Override
    public void start() {
        {
            System.out.println("завести двигатель");
            System.out.println("проверить все системы авто");
            System.out.println("Нажать сцепление и газ");
            System.out.println("Водитель " + getFullName() + " категории В тронулся в путь");
        }

    }

    @Override
    public void finish() {
        {
            System.out.println("Водитель " + getFullName() + " категории В остановился");

        }
    }

    @Override
    public void refuel() {
        {
            System.out.println("Водитель " + getFullName() + " категории В заправил авто");

        }

    }
}
