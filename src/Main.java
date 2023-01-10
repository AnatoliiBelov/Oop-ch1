import java.security.AllPermission;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car("Lada","Granta",1.7,"желтый",2015,"России");
     /*   granta.brand = "Lada";
        granta.model = "Granta";
        granta.year=2015;
        granta.contry = "России";
        granta.color = "желтый";
        granta.engineVolume = 1.7;*/
        Car a8=new Car("Audi","A8 50 L TDI quattro",3.0,"черный",2020,"Германии");
       /* a8.brand = "Audi";
        a8.model = "A8 50 L TDI quattro";
        a8.year = 2020;
        a8.contry = "Германии";
        a8.color = "черный";
        a8.engineVolume = 3.0;*/
        Car z8 = new Car("BMW","Z8",3.0,"черный",2021,"Германии");
       /* z8.brand = "BMW";
        z8.model = "Z8";
        z8.contry = "Германии";
        z8.year=2021;
        z8.color = "черный";
        z8.engineVolume = 3.0;*/
        Car sportage = new Car("KIA","Sportage 4-го поколения",2.4,"красный",2018,"Южной Корее");
        /*sportage.model = "Sportage 4-го поколения";
        sportage.brand = "KIA";
        sportage.year=2018;
        sportage.contry = "Южной Корее";
        sportage.color = "красный";
        sportage.engineVolume = 2.4;*/
        Car avante = new Car("Hyundai","Avante",1.6,"оранжевый",2016,"Южной Корее");
        /*avante.brand = "Hyundai";
        avante.model = "Avante";
        avante.contry = "Южной Корее";
        avante.color = "оранжевый";
        avante.engineVolume = 1.6;
        avante.year=2016;*/
        System.out.println(granta);
        System.out.println(a8);
        System.out.println(z8);
        System.out.println(sportage);
        System.out.println(avante);
        Car dsa = new Car("","",0,"",0,"");
        System.out.println(dsa);

    }
}