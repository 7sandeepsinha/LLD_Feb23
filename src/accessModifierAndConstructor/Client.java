package accessModifierAndConstructor;

public class Client {
    public static void main(String[] args) {
        Student s0 = new Student();
        Student s = new Student("Karthik", 1, true, 90, 'A');
        Student s1 = new Student("Chandrika", 5);

        System.out.println(s.getName());
        System.out.println(s.getRoll());
        System.out.println(s.getPercentage());
        System.out.println(s.isPass());
        System.out.println(s.getGrade());


        System.out.println(s1.getName());
        System.out.println(s1.getRoll());
        System.out.println(s1.getPercentage());
        System.out.println(s1.isPass());
        System.out.println(s1.getGrade());

    }
}
