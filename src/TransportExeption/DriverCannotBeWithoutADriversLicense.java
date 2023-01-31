package TransportExeption;

public class DriverCannotBeWithoutADriversLicense extends Exception{
    public DriverCannotBeWithoutADriversLicense(String message) {
        super(message);
    }
}
