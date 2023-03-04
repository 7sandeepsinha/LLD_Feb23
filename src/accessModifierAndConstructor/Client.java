package accessModifierAndConstructor;

public class Client {
    public static void main(String[] args) {
        Student s0 = new Student();
        Student s = new Student("Karthik", 1, true, 90, 'A');
        Student s1 = new Student("Chandrika", 5);

        // System.out.println(s.getName());
        // System.out.println(s.getRoll());
        // System.out.println(s.getPercentage());
        // System.out.println(s.isPass());
        // System.out.println(s.getGrade());
        //
        //
        // System.out.println(s1.getName());
        // System.out.println(s1.getRoll());
        // System.out.println(s1.getPercentage());
        // System.out.println(s1.isPass());
        // System.out.println(s1.getGrade());

        Phone iphone11 = new Phone(11,"iphone",13,"ABionic",6,4000,12,60000);
        Phone iphone12 = new Phone(iphone11);
        Phone iphone13 = new Phone(iphone12);

        System.out.println(iphone12.getModelName());
        System.out.println(iphone12.getModelNo());
        System.out.println(iphone12.getProcessorName());
        System.out.println(iphone12.getProcessorVersion());
        System.out.println(iphone12.getScreensize());
        System.out.println(iphone12.getBatteryCapacity());
        System.out.println(iphone12.getCameraSpecs());
        System.out.println(iphone12.getPrice());

        Phone iphone14a = new Phone(iphone13); //deep copy
        Phone iphone14b = iphone13; // shallow copy


        Student student1 = new Student("A", 10); //700
        Student student2 = student1; //700
        Student student3 = new Student(student2); //702

        student2.setRoll(20); // 700 -> roll : 20
        System.out.println(student1.getRoll());//20
        System.out.println(student2.getRoll());//20
        System.out.println(student3.getRoll());//10
    }
}