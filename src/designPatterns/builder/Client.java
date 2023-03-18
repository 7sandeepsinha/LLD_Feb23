package designPatterns.builder;

public class Client {
    public static void main(String[] args) {

        Student s = Student.builder() //builder obj
                            .setId(1) // builder obj with only Id set
                            .setName("Tharun") //builder obj with name,id,batchname
                            .setGradyear(2022) //builder obj with name,id,batchname,gradYear
                            .setYoe(1)
                            .build();

        //Student s = new Student(1, "LLD", "Tharun", 2022, 1)
        //s.setPsP(90);
        //s.setName(null);
        /*
                public void setName(String name){
                    if(name != null){
                        this.name = name;
                   } else {
                        exception
                   }
                }
         */
    }
}
