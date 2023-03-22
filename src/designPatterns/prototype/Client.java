package designPatterns.prototype;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();

        Student aprBatch = new Student();
        aprBatch.setBatchName("Apr2022");
        aprBatch.setAvgBatchPsp(90);
        aprBatch.setInstructorName("Sandeep");
        aprBatch.setYearOfEnrollment(2022);

        Student mayBatch = new Student();
        mayBatch.setBatchName("May2022");
        mayBatch.setAvgBatchPsp(85);
        mayBatch.setInstructorName("Naman");
        mayBatch.setYearOfEnrollment(2022);

        Student juneBatch = new Student();
        juneBatch.setBatchName("June2022");
        juneBatch.setAvgBatchPsp(92);
        juneBatch.setInstructorName("Tarun");
        juneBatch.setYearOfEnrollment(2022);

        studentRegistry.save(aprBatch);
        studentRegistry.save(mayBatch);
        studentRegistry.save(juneBatch);

        //student of april batch
        Student aprBatchPrototype = studentRegistry.get("Apr2022");
        Student raj = aprBatchPrototype.clone();
        raj.setId(1);
        raj.setName("Raj");
        raj.setAge(26);

        //student of may batch
        Student mayBatchPrototype = studentRegistry.get("May2022");
        Student naveen = mayBatchPrototype.clone();
        naveen.setId(2);
        naveen.setName("Naveen");
        naveen.setAge(26);

        IntelligentStudent superBatch2022 = new IntelligentStudent();
        superBatch2022.setBatchName("SuperBatch");
        superBatch2022.setAvgBatchPsp(100);
        superBatch2022.setInstructorName("XYZ");
        superBatch2022.setYearOfEnrollment(2023);

        IntelligentStudent superA = superBatch2022.clone();
        superA.setId(2);
        superA.setName("A");
        superA.setAge(12);
        superA.setIq(100);
    }
}
/*
      Create prototype objects
      Store in a registry(map)
      Get the prototype from map
      Create a clone(deepCopy) of the prototype
      Update the values, and use it
 */

// Create a prototype and registry design pattern solution for
// local trains in Mumbai
// All trains have same fare, same train type, same engine type, same number of seats
// but have different timings, and stations
