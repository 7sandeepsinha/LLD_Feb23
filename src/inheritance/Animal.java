package inheritance;

public class Animal {
    private int noOfLegs;
    private boolean canSwim;

    public void breathe(){
        System.out.println("Animal is breathing");
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }
}
