package practice;

public class App {
    public static void main(String[] args) {
        Student A = new Student(1, 10, "yogesh", 10,"ritika");
//        System.out.println(A.name);
//        System.out.println(A.age);



        System.out.println(A.getName());
        System.out.println(A.getAge());
        A.setAge(25);
        System.out.println(A.getAge());




//        A.name = "yogesh";
//        A.id = 1;
//        A.age = 10;
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);

    }
}
