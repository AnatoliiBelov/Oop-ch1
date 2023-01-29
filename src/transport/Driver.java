package transport;

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

    public Driver(String fullName, boolean driversLicence, int driverExperience) {
        this.fullName = fullName;
        this.driversLicence = driversLicence;
        this.driverExperience = driverExperience;
    }

    public abstract void start();

    public abstract void finish();

    public abstract void refuel();
}
