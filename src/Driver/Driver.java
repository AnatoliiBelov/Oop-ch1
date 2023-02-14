package Driver;

import TransportExeption.DriverCannotBeWithoutADriversLicenseException;

import java.util.Objects;

public abstract class Driver {
    private final String fullName;
    private boolean driversLicence;
    private int driverExperience;

    public String getFullName() {
        return fullName;
    }

    public boolean isDriversLicence() {
        return driversLicence;
    }


    public void setDriversLicence(boolean driversLicence) {
        this.driversLicence = driversLicence;
    }

    public int getDriverExperience() {
        return driverExperience;
    }

    public void setDriverExperience(int driverExperience) {
        this.driverExperience = driverExperience;
    }

    public Driver(String fullName, boolean driversLicence, int driverExperience) throws DriverCannotBeWithoutADriversLicenseException {

        if (!driversLicence) {
            throw new DriverCannotBeWithoutADriversLicenseException("У водителя обязательно должны быть Водительские права");
        }
        this.driversLicence = driversLicence;
        this.driverExperience = driverExperience;
        this.fullName = fullName;
    }


    public abstract void start();

    public abstract void finish();

    public abstract void refuel();

    @Override
    public String toString() {
        return "Водитель " + fullName + ", опыт вождения " + driverExperience +
                " лет";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver driver = (Driver) o;
        return driversLicence == driver.driversLicence && driverExperience == driver.driverExperience && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driversLicence, driverExperience);
    }
}
