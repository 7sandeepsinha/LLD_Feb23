package accessModifierAndConstructor;

public class Student {
    private String name; //null
    private int roll;//0
    private boolean pass;//false
    private double percentage;//0.0
    private char grade;// \u0000

    //no args constructor -> created by the user
    public Student() {
        name = "";
        roll = 1;
        pass = true;
        percentage = 100;
        grade = 'A';
    }

    //parameterised constructor -> we can set values, and pass them as parameters to constructor
    public Student(String sName, int sRoll, boolean sPass, double sPercentage, char sGrade){
        name = sName;
        roll = sRoll;
        pass = sPass;
        percentage = sPercentage;
        grade = sGrade;
    }

    //parameterised constructor -> we can choose the combination of attributes to be passed
    //other attributes, for which we have not passed a value will have default values
    public Student(String sName, int sRoll){
        name = sName;
        roll = sRoll;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if(newName.equals("")){
            System.out.println("Can not update to an empty string");
        }else{
            name = newName;
        }
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public boolean isPass() {
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}
//Access modifier -> modifies the access to an attribute, method or constructor of a class from outside.
//Types of access modifier -> private, public, protected, default

//If you dont add any constructor, Java will by default provide a constructor -> Default Constructor
//Default constructor -> it sets all the values of the attributes to their default values.

/*
    If we add any constructor in the class, Java will not give us a default constructor

    Constructor -
      No-arg constructor - created by user, and can have some values to be used default values for attributes.
      Parameterised Constructor
      Copy Constructor
 */