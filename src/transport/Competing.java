package transport;

public interface Competing {
    void goToPitStop();

    void fixBestLapTime(String time);

    void fixMaxSpeed(double maxSpeed);
}
