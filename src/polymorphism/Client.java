package polymorphism;

public class Client {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10,15); //int, int
        c.add(10, 15.5);//int, double
        c.add(5.5,6.7);//double, double
        c.add(5.6,10);//double, int

        System.out.println("Hello world");
        System.out.println(5);
        System.out.println(true);
        System.out.println('A');
        System.out.println();

        ElectricCar electricCar = new ElectricCar();
        electricCar.startCar();
    }
}
