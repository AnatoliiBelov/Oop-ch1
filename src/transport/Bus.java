package transport;

public class Bus extends Transport<DriverBusD> implements Competing {
    numberOfSeats numberOfSeats;


    public enum numberOfSeats {
        //особо малая (до 10 мест);
        //малая (до 25);
        //средняя (40–50);
        //большая (60–80);
        //особо большая (100–120 мест).
        ESPECIALLY_SMALL(null, 10, "особо малая (до 10 мест)"),
        SMALL(11, 20, "малая (до 25)"),
        AVERAGE(40, 50, "средняя (40–50)"),
        LARGE(60, 80, "большая (60–80)"),
        ESPECIALLY_LARGE(100, 120, "особо большая (100–120 мест)");
        Integer minNumberOfSeats;

        Integer maxNumberOfSeats;

        String characteristicsInRussian;

        numberOfSeats(Integer minNumberOfSeats, Integer maxNumberOfSeats, String characteristicsInRussian) {
            this.minNumberOfSeats = minNumberOfSeats;
            this.maxNumberOfSeats = maxNumberOfSeats;
            this.characteristicsInRussian = characteristicsInRussian;
        }

        public Integer getMinNumberOfSeats() {
            return minNumberOfSeats;
        }

        public Integer getMaxNumberOfSeats() {
            return maxNumberOfSeats;
        }

        public String getCharacteristicsInRussian() {
            return characteristicsInRussian;
        }

        @Override
        public String toString() {
            if (minNumberOfSeats != null && maxNumberOfSeats != null) {
                return "Вместимость:  " +
                        "от " + minNumberOfSeats + " мест до " + maxNumberOfSeats + " мест";
            } else if (minNumberOfSeats == null) {
                return "Вместимость: " +
                        "до " + maxNumberOfSeats + " мест";
            } else {
                return "Вместимость: " +
                        "от " + minNumberOfSeats + " мест";
            }
        }
    }


    public Bus(String brand, String model, double engineVolume, DriverBusD driverBusD) {
        super(brand, model, engineVolume, driverBusD);
    }

    public Bus.numberOfSeats getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Bus.numberOfSeats numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    public void printType() {
        if (numberOfSeats==null){
            System.out.println("Данных по транспортному средству недостаточно");
        }else {
            System.out.println(numberOfSeats);}}

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
        System.out.println("максимальная скорость:  " + maxSpeed);
    }

}
