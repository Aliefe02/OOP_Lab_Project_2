package tr.edu.maltepe.oop;

public class Person {

    private String name;
    private String surname;
    private String class_name;



    public String getname()
    {
        return name;
    }
    public String getsurname()
    {
        return surname;
    }

    public String getclass_name()
    {
        return class_name;
    }

    public void setname(String name)
    {
        this.name = name;
    }

    public void setsurname(String surname)
    {

        this.surname = surname;
    }

    public void setclass_name(String class_name)
    {
        this.class_name = class_name;
    }
}
