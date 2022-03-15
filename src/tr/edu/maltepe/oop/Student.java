package tr.edu.maltepe.oop;

public class Student extends Person{

    private int Student_number;
    Student(String name,String surname,int Student_number)
    {
        setname(name);
        setsurname(surname);
        this.Student_number = Student_number;
    }

    void enroll_class(String class_name)
    {
        setclass_name(class_name);
        System.out.println("Student "+getname()+" has enrolled "+getclass_name());

    }
}

