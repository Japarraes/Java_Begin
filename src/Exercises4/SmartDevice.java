package Exercises4;

public class SmartDevice {

    //Atributos
    String manufacturer; // fabricante

    String system; // sistema operativo (android; iOS)

    //Constructores
    public SmartDevice() {

    }

    public SmartDevice(String manufacturer, String system) {
        this.manufacturer = manufacturer;
        this.system = system;
    }

    // toString implementation
    @Override
    public String toString() {
        return "SmartDevice{" +
                "manufacturer='" + manufacturer + '\'' +
                ", system='" + system + '\''
                + '}';
    }
}
