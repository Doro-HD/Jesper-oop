import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ControlSystem controlSystem = new ControlSystem();

        Car car = new Car(controlSystem, "Toyota", "Corolla");
        Bike bike = new Bike(controlSystem);

    }

    public static void test(ITest iTest) {
        iTest.test();
    }

    public static void vehicularTest(Vehicular vehicular) {
        System.out.println(vehicular);
    }
}
