public class Car extends Vehicle{
    private int gas;

    public Car(int year, String make, String model, int gas){
        super(year, make, model, gas);
        this.gas = gas;
    }

    public int void go(){
        gas = gas - 1;
        return gas;

    }
}