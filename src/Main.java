import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car("Lada", "Granta", 1.7, "желтый", 2015, "России", "механическая", "седан", "Н230ЕР777", 5, false);
        Car a8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германии", "АКПП", "седан", null, 5, true);
        Car z8 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германии", "АКПП", "седан", null, 5, true);
        Car sportage = new Car("KIA", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южной Корее", "механическая", "седан", null, 5, true);
        Car avante = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южной Корее", "АКПП", "седан", null, 5, true);
        System.out.println(granta);
        System.out.println(a8);
        System.out.println(z8);
        System.out.println(sportage);
        System.out.println(avante);

    }
}