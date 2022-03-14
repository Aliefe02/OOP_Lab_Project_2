package tr.edu.maltepe.oop;

public class Professor extends Person{


    Professor(String name,String surname)
    {
        setname(name);
        setsurname(surname);
    }

    void teach(Student student)
    {
        System.out.println("Professor "+getname()+" teaches "+student.getname()+" in "+getclass_name());
    }


}
