import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Objekter
        Car car = new Car();
        Bike bike = new Bike();

        vehicularTest(car);
        vehicularTest(bike);

    }

    public static void test(ITest iTest) {
        iTest.test();
    }

    public static void vehicularTest(Vehicular vehicular) {
        System.out.println(vehicular);
    }
}
