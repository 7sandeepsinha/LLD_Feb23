package abstractClassDemo;

public abstract class Animal {
    String name;
    int noOfLegs;

    public void breathe(){
        System.out.println("Animal is breathing");
    }

    public abstract void walk();
}

// Can a normal class contain abstract methods -> NO
// Can an abstract class contain concrete[normal] methods ->  YES
// Can an abstract class contain attributes -> YES
// Can we create an object of an abstract class -> NO
// Does an abstract class need to have abstract method ? -> NO

// Animal a = new Animal(); a.walk();