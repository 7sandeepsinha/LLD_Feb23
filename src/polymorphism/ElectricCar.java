package polymorphism;

public class ElectricCar extends Vehicle{

    @Override
    public void startCar(){
        System.out.println("Electric motor is running, thus car is ready to go");
    }

    public void startCarInitial(){
        super.startCar();
    }
}

/*
    Vehicle
    ElectricCar
    HydrogenCar
    ICECar

    10 cars -> 4 electric, 3 hydro, 3 ice

    List of cars are given, start all of them

    public void startAllCars(List<Vehicle> cars){
       for(Vehicle v : cars){
            v.startCar();
       }
    }
 */