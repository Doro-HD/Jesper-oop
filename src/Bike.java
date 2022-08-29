public class Bike extends Vehicular implements ITest {

    public Bike(ControlSystem controlSystem) {
        super(controlSystem);
    }
    @Override
    public void test() {
        System.out.println("shing");
    }
}
