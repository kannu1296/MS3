package solid.l.solution;

import solid.l.util.Engine;

public class DeviceWithEngine extends TransportationDevice {
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        System.out.println("start");
    }
}
