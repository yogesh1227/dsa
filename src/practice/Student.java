package practice;

public class Student {
    //Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    public Student(){
        System.out.println("default constructor is called ");
    }

    public void studying(){
        System.out.println("studying is done by " + name);
    }
}
