package interfaceDemo;

public class Cat implements Animal{
    @Override
    public void run() {
        System.out.println("Cat is running");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void walk() {
        System.out.println("Cat is walking");
    }
}
