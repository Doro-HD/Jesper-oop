public class Vehicular {
    private Motor motor;
    private ControlSystem controlSystem;

    public Vehicular(ControlSystem controlSystem) {
        this.controlSystem = controlSystem;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public ControlSystem getControlSystem() {
        return controlSystem;
    }

    public void setControlSystem(ControlSystem controlSystem) {
        this.controlSystem = controlSystem;
    }

    public String toString() {
        return this.motor + " " + this.controlSystem;
    }
}
