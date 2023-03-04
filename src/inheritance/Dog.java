package inheritance;

public class Dog extends Animal{
    private String name;

    public void play(){
        System.out.println("Dog is playing");
    }

    public void survive(){
        // eat, breathe, sleep
        super.breathe();
        super.eat();
        super.sleep();
    }
}
