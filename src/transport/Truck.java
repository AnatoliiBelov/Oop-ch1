package transport;

public class Truck extends Transport<DriverTruckС> implements Competing {
    tonnage tonnage;
    public enum tonnage {
        N1(null,3.5,"с полной массой до 3,5 тонн"),
        N2(3.5,12.0, "с полной массой свыше 3,5 до 12 тонн"),
        N3(12.0,null,"с полной массой свыше 12 тонн");
        //N1 (с полной массой до 3,5 тонн);
        //N2 (с полной массой свыше 3,5 до 12 тонн);
        //N3 (с полной массой свыше 12 тонн);
Double minTonnage;
        Double maxTonnage;

        String tonnageOnRussian;

        tonnage(Double minTonnage, Double maxTonnage, String tonnageOnRussian) {
            this.minTonnage = minTonnage;
            this.maxTonnage = maxTonnage;
            this.tonnageOnRussian = tonnageOnRussian;
        }

        public Double getMinTonnage() {
            return minTonnage;
        }

        public Double getMaxTonnage() {
            return maxTonnage;
        }

        public String getTonnageOnRussian() {
            return tonnageOnRussian;
        }

        @Override
        public String toString() {
            if (minTonnage!=null&&maxTonnage!=null){
            return "Грузоподъемность: " +
                   "от " +minTonnage+ " тонн до "+maxTonnage+" тонн";
        }else if (minTonnage==null){return "Грузоподъемность: " +
                   "до "+maxTonnage+" тонн";}
            else {return "Грузоподъемность: " +
                    "от " +minTonnage+ " тонн";}
    }}

    public Truck(String brand, String model, double engineVolume, DriverTruckС driverTruckС) {
        super(brand, model, engineVolume, driverTruckС);
    }

    public Truck.tonnage getTonnage() {
        return tonnage;
    }

    public void setTonnage(Truck.tonnage tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public void start() {
        System.out.println("завести двигатель");
        System.out.println("провести специальные процедуры для грузовиков");
        System.out.println("проверить все системы авто");
        System.out.println("Нажать сцепление и газ");

    }

    @Override
    public void finish() {
        System.out.println("Полная остановка авто");
        System.out.println("провести специальные процедуры для грузовиков");

    }

    @Override
    public void printType() {
        if (tonnage==null){
            System.out.println("Данных по транспортному средству недостаточно");
        }else {
        System.out.println(tonnage);}
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
