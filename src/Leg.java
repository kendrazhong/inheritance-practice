public class Leg extends Vehicle{
    private int mentalStrength;

    public Car(int year, String make, String model, int mentalStrength){
        super(year, make, model, mentalStrength);
        this.mentalStrength = mentalStrength;
    }

    public String motivation(){
        if (mentalStrength < 0){
            return "time to give up...";
        }
    }

    
}