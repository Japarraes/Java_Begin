package Exercises4;

public class SmartPhone extends SmartDevice{

    // Atributos
    String model;
    double size;
    String version;
    int memory;

    // Constructores
    public SmartPhone() {
        super();
    }

    public SmartPhone(String manufacturer, String system, String model, double size, String version, int memory) {
        super(manufacturer, system);
        this.model = model;
        this.size = size;
        this.version = version;
        this.memory = memory;
    }

    // toString() implementation

    @Override
    public String toString() {
        return "SmartPhone{" +
                "manufacturer='" + manufacturer + '\'' +
                ", system='" + system + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", version='" + version + '\'' +
                ", memory=" + memory +
                '}';
    }
}
