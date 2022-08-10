package Exercises4;

import java.sql.SQLOutput;

public class Tema4Main {

    public static void main(String[] args) {

        SmartDevice dispositivo1 = new SmartDevice("Samsung", "Android");
        System.out.println(dispositivo1.toString());

        SmartPhone dispositivo2 = new SmartPhone("Samsung", "Android", "Galaxy", 5.8d,
                "v9.1", 64);
        System.out.println(dispositivo2.toString());

        SmartWatch dispositivo3 = new SmartWatch("Samsung", "Android", "Galaxy Watch 4",
                1.4d, "v2.0", 16, "black", true, true);
        System.out.println(dispositivo3.toString());

    }

}
