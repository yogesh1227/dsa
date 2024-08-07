package practice;

public class Student {
    //Attributes
    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;


    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    // Default ctor sets the value to garbage or null
    public Student(){
        System.out.println("default constructor is called ");
    }

    public Student(int id, int age, String name, int nos , String gf) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }

    //methods or behaviour

    public void study(){
        System.out.println(name + "studying");
    }

    public void bunk(){
        System.out.println(name + "bunking");
    }
    public void studying(){
        System.out.println("studying is done by " + name);
    }

    private void gfChatting(){
        System.out.println(name + " is chatting with gf");

    }
}
