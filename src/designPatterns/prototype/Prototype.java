package designPatterns.prototype;

public interface Prototype<T> {
    T clone();
}

// clone -> getCopy
/*
     Student, Teacher, Notebook

     public interface StudentPrototype{
        Student clone();
     }

     public interface TeacherPrototype{
        Teacher clone();
     }

     public interface NotebookPrototype{
        Notebook clone();
     }
 */