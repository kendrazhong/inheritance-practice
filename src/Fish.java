public class Fish extends Animal{
    private int leg;

    public Fish(String name, int age, int leg) {
        this.leg = leg;
    }

    public String isItAFish (){
        if (leg != 0){
            return "no!";
        }
    }
}