package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {

        Professor Ensar = new Professor("Ensar","Gul");
        Ensar.setclass_name("SE 237");

        Student Ali = new Student("Ali","Efe",200704019);
        Ali.enroll_class("SE 237");

        Ensar.teach(Ali);


    }
}
