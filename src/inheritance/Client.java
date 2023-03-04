package inheritance;

public class Client {
    public static void main(String[] args) {
        Instructor i  = new Instructor(1, "Sandeep", "12234456", 5, "LLD");
        Dog d = new Dog();
        d.survive();


        //Animal - parent
        //Dog - child

        //implicit casting or, upcasting
        Animal a = new Dog();
        a.breathe();
        a.eat();
        a.sleep();

        //explicit casting or, downcasting
        Dog dog = (Dog)new Animal();
        dog.play();

        double x = 9.12;
        int y = (int) x;
    }
}
