import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car("Lada", "Granta", 2015, "России", "желтый", 200, 1.7, "механическая", "седан", "Н230ЕР777", 5, false);
        Car a8 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черный", 250, 3.0, "АКПП", "седан", "", 5, true);
        Car z8 = new Car("BMW", "Z8", 2021, "Германии", "черный", 250, 3.0, "АКПП", "седан", "", 5, true);
        Car sportage = new Car("KIA", "Sportage 4-го поколения", 2018, "Южной Корее", "красный", 200, 2.4, "механическая", "седан", "", 5, true);
        Car avante = new Car("Hyundai", "Avante", 2016, "Южной Корее", "оранжевый", 200, 1.6, "АКПП", "седан", "", 5, true);
        System.out.println(granta);
        System.out.println(a8);
        System.out.println(z8);
        System.out.println(sportage);
        System.out.println(avante);

        Bus schoolBus = new Bus("Камаз", "6282", 2010, "России", "синий", 130);
        System.out.println(schoolBus);
        Bus maz = new Bus("МАЗ", "203", 2015, "Белоруссии", "синий", 140);
        System.out.println(maz);
        Bus liaz = new Bus("ЛиАЗ", "6113.65", 2018, "России", "желтый", 85);
        System.out.println(liaz);
    }
}