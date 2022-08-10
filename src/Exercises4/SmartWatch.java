package Exercises4;

public class SmartWatch extends SmartPhone{

    //Atributos
    String color;
    boolean gps;
    boolean accelenometer;

    //Constructores
    public SmartWatch(){
        super();
    }

    public SmartWatch(String manufacturer, String system, String model, double size, String version, int memory,
                      String color, boolean gps, boolean accelenometer) {
        super(manufacturer, system, model, size, version, memory);
        this.color = color;
        this.gps = gps;
        this.accelenometer = accelenometer;
    }

    // toString() implementation


    @Override
    public String toString() {
        return "SmartWatch{" +
                "manufacturer='" + manufacturer + '\'' +
                ", system='" + system + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", version='" + version + '\'' +
                ", memory=" + memory +
                ", color='" + color + '\'' +
                ", gps=" + gps +
                ", accelenometer=" + accelenometer +
                '}';
    }
}
