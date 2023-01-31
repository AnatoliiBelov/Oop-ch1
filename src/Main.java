import Driver.Driver;
import Driver.DriverBusD;
import Driver.DriverCarB;
import Driver.DriverTruckС;
import TransportExeption.DriverCannotBeWithoutADriversLicense;
import mechanic.Mechanic;
import mechanic.TechnicalServiceStation;
import transport.*;


import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws DriverCannotBeWithoutADriversLicense {

//        Car granta = new Car("Lada", "Granta", 2015, "России", "желтый", 200, 1.7, "механическая", "седан", "Н230ЕР777", 5, false);
//        Car a8 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черный", 250, 3.0, "АКПП", "седан", "", 5, true);
//        Car z8 = new Car("BMW", "Z8", 2021, "Германии", "черный", 250, 3.0, "АКПП", "седан", "", 5, true);
//        Car sportage = new Car("KIA", "Sportage 4-го поколения", 2018, "Южной Корее", "красный", 200, 2.4, "механическая", "седан", "", 5, true);
//        Car avante = new Car("Hyundai", "Avante", 2016, "Южной Корее", "оранжевый", 200, 1.6, "АКПП", "седан", "", 5, true);
//        System.out.println(granta);
//        System.out.println(a8);
//        System.out.println(z8);
//        System.out.println(sportage);
//        System.out.println(avante);

//        Bus schoolBus = new Bus("Камаз", "6282", 2010, "России", "синий", 130);
//        System.out.println(schoolBus);
//        Bus maz = new Bus("МАЗ", "203", 2015, "Белоруссии", "синий", 140);
//        System.out.println(maz);
//        Bus liaz = new Bus("ЛиАЗ", "6113.65", 2018, "России", "желтый", 85);
//        System.out.println(liaz);
        Bus schoolBus = new Bus("Камаз", "6282", 10.6, new DriverBusD("Лихачев ВА", false, 2));
        Bus maz = new Bus("МАЗ", "203", 10.8, new DriverBusD("Баринов ЕС", true, 1));
        Bus liaz = new Bus("ЛиАЗ", "6113.65", 20.0, new DriverBusD("Кириллов АО", true, 3));
        Bus mersedes = new Bus("Mercedes-Benz", "O325", 10.8, new DriverBusD("Василенко ЕА", true, 2));
        Car granta = new Car("Lada", "Granta", 1.7, new DriverCarB("Иванов АО", true, 1));
        Car a8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, new DriverCarB("Петров ОН", true, 2));
        Car z8 = new Car("BMW", "Z8", 3.0, new DriverCarB("Сидоров СК", true, 3));
        Car sportage = new Car("KIA", "Sportage 4-го поколения", 2.4, new DriverCarB("Клещев КВ", true, 1));
        Truck kamaz = new Truck("КамАЗ", "4310", 11, new DriverTruckС("Максимов ЕА", true, 3));
        Truck duf = new Truck("DAF", "45/55", 5.88, new DriverTruckС("Лесков МЕ", true, 3));
        Truck man = new Truck("MAN", "TGS", 10.5, new DriverTruckС("Сулягин КМ", true, 3));
        Truck volvo = new Truck("Volvo", "FM", 12.1, new DriverTruckС("Андреев НВ", true, 3));
        printInfo(schoolBus);
        printInfo(maz);

        printInfo(liaz);

        printInfo(mersedes);

        printInfo(granta);

        printInfo(a8);

        printInfo(z8);

        printInfo(sportage);

        printInfo(kamaz);

        printInfo(duf);
        printInfo(man);
        printInfo(volvo);

        maz.printType();
        maz.setNumberOfSeats(Bus.numberOfSeats.SMALL);
        maz.printType();
        List<Transport> listOfRacers = new ArrayList<>();
        listOfRacers.add(schoolBus);
        listOfRacers.add(maz);
        listOfRacers.add(liaz);
        listOfRacers.add(mersedes);
        listOfRacers.add(granta);
        listOfRacers.add(a8);
        listOfRacers.add(z8);
        listOfRacers.add(kamaz);
        listOfRacers.add(duf);
        listOfRacers.add(man);
        listOfRacers.add(volvo);
        System.out.println(listOfRacers.get(5));
        System.out.println(listOfRacers.toString());
        Mechanic volodin = new Mechanic("Володин ИВ", "ABC");
        Mechanic kovalev = new Mechanic("Ковалев КН", "BCD");
        Mechanic ljashko = new Mechanic("Ляшко ВС", "DEF");
        maz.addMechanic(kovalev);
        granta.addMechanic(volodin);
        printInfoDriverPlusMechanic(maz);
        List <Driver> drivers=new ArrayList<>();
        drivers.add(schoolBus.getDriver());
        drivers.add(maz.getDriver());
        drivers.add(liaz.getDriver());
        drivers.add(mersedes.getDriver());
        drivers.add(granta.getDriver());
        drivers.add(a8.getDriver());
        drivers.add(z8.getDriver());
        drivers.add(kamaz.getDriver());
        drivers.add(duf.getDriver());
        drivers.add(man.getDriver());
        drivers.add(volvo.getDriver());

   TechnicalServiceStation tSS = new TechnicalServiceStation("СТО");
   tSS.addTransportToQueue(a8);
        tSS.addTransportToQueue(granta);
        tSS.addTransportToQueue(duf);
        tSS.addTransportToQueue(liaz);
        tSS.carryOutInspectionOfTransport();



//        try {
//            maz.passDiagnostics();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }


    }


    public static void printInfoDriverPlusMechanic(Transport<?> transport) {
        System.out.println("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " управляется: " + transport.getDriver() + "; и обслуживается " + transport.getListOfMechanics());

    }

    public static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getFullName() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");
    }
}