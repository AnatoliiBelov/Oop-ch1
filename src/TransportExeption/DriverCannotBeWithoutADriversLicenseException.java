package TransportExeption;

public class DriverCannotBeWithoutADriversLicenseException extends Exception{
    public DriverCannotBeWithoutADriversLicenseException(String message) {
        super(message);
    }
}
