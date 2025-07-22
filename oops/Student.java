import java.util.*;

public class Student{
    int rollNo;
    String name;
    int age;
    int id;
    Student(int rollNo, String name, int age, int id){
        this.rollNo=10;
        this.name="Vinit";
        this.age=21;
        this.id=101;
    }
    Student(){
        System.out.println("default constructor");
    }
    void display(){
        System.out.println("rollNo: "+rollNo);
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("id: "+id);
    }
    void display(int rollNo, String name){
        System.out.println("rollNo: "+rollNo);
        System.out.println("name: "+name);
    }
    void display(int rollNo, int age){
        System.out.println("rollNo: "+rollNo);
        System.out.println("age: "+age);
    }
}
class basic {
    public static void main(String args[]){
        Student s1 = new Student();
        // Student s2 = new Student(1,"Vinit",20,101);
        s1.display();
        // s2.display();
        s1.display(1,"Vinit");
        s1.display(1,20);
    }
}