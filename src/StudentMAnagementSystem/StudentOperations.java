package StudentMAnagementSystem;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class StudentOperations {

    ArrayList<Student> students ;

    public StudentOperations() {
        students = new ArrayList<>();
    }

    public void addStudent(){
        Scanner in = new Scanner(System.in);

        Student student = new Student();

        System.out.println("enter name of student");
        student.setName(in.nextLine());

        System.out.println("enter the roll no of student");
        int rollNo = in.nextInt();
        student.setRoll(rollNo);

        System.out.println("enter the marks of student");
        int marks = in.nextInt();
        student.setMarks(marks);

        students.add(student);

    }

    public void deleteStudent(){
        Student student = search();
        if(Objects.nonNull(student)){
            students.remove(student);
            System.out.println("Student deleted Successfully!S!");
        }else{
            System.out.println("Student not found!!");
        }
    }

    public Student search(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the roll no of student");
        int rollNo = in.nextInt();
        Student student = null;

         for(Student s : students)
         {
             if(s.getRoll()==rollNo){
                 student=s;
                 break;
             }
         }
         if(Objects.nonNull(student)){
             System.out.println(student);
             return student;
         }
        System.out.println("No found");
         return null;
    }
    public void showStudents(){
        System.out.println(students);
    }


    public void updateStudent() {
        Student student = search();
        if (Objects.nonNull(student)) {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter new name");
            String name = in.nextLine();
            if (!name.isEmpty()) {
                student.setName(name);
            }

            System.out.println("Enter new roll number");
            String rollNoInput = in.nextLine();
            if (!rollNoInput.isEmpty()) {
                int rollNo = Integer.parseInt(rollNoInput);
                student.setRoll(rollNo);
            }

            System.out.println("Enter new marks");
            String marksInput = in.nextLine();
            if (!marksInput.isEmpty()) {
                int marks = Integer.parseInt(marksInput);
                student.setMarks(marks);
            }

            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }


}
