public class Car extends Vehicular implements ITest{

    private double price;
    private String brand;
    private String model;

    public Car(ControlSystem controlSystem, String brand, String model) {
        super(controlSystem);
        this.brand = brand;
        this.model = model;
    }

    public void test() {
        System.out.println("vroom");
    }

    public String getBrand() {
        return this.brand;
    }

    public void setPrice(double price) {
        if (!(price < 0)) {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "{Brand=" + this.brand + ", Model=" + this.model + "}";
    }

}
