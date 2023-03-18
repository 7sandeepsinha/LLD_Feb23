package designPatterns.builder;

import designPatterns.builder.exception.InvalidGradYearException;
import designPatterns.builder.exception.InvalidNameException;
import designPatterns.builder.exception.InvalidYoeException;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private int yoe;
    private int gradyear;
    private double psp;
    private String batchName;

    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.yoe = builder.yoe;
        this.gradyear = builder.gradyear;
        this.psp = builder.psp;
        this.batchName = builder.batchName;
    }

    //add setters in student with proper validation if updation is required
    //generally we dont update objects created with Builder pattern

    public static Builder builder(){
        Builder b = new Builder();
        return b;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yoe=" + yoe +
                ", gradyear=" + gradyear +
                ", psp=" + psp +
                ", batchName='" + batchName + '\'' +
                '}';
    }

    static class Builder {
        private int id;
        private String name; //name should not be null
        private int yoe;//yoe should >=1
        private int gradyear; //gradYear <2023
        private double psp;
        private String batchName;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }

        public Builder setGradyear(int gradyear) {
            this.gradyear = gradyear;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        public void validate(){
            if(name == null){
                throw new InvalidNameException("Name is invalid");
            }
            if(yoe < 1){
                throw new InvalidYoeException("Years of experience should be atleast 1");
            }
            if(gradyear >= 2023){
                throw new InvalidGradYearException("Grad year should be 2022 or earlier");
            }
        }

        public Student build(){
            this.validate();
            Student s = new Student(this);
            return s;
        }
    }
}
