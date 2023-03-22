package designPatterns.prototype;

public class Student implements Prototype<Student> {
    private int id;
    private String name;
    private int age;
    private String batchName;
    private String instructorName;
    private double avgBatchPsp;
    private int yearOfEnrollment;

    public Student() {
    }

    public Student(Student student){
        this.batchName = student.batchName;
        this.instructorName = student.instructorName;
        this.avgBatchPsp = student.avgBatchPsp;
        this.yearOfEnrollment = student.yearOfEnrollment;
    }

    @Override
    public Student clone() {  // sObj.clone();
        Student studentClone = new Student(this); // this == sObj
        return studentClone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public void setYearOfEnrollment(int yearOfEnrollment) {
        this.yearOfEnrollment = yearOfEnrollment;
    }
}
