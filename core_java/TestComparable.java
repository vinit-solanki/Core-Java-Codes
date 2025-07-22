// Natural sorting by id
import java.util.*;
class Student implements Comparable<Student>{
    int id;
    String name;
    int age;
    Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age=age;
    }
    public int compareTo(Student s){
        return this.id=id;
    }
    public String toString(){
        return id+" - "+name+" - "+age;
    }
}
class SortByName implements Comparator<Student>{
    public int compare(Student a, Student b){
        return a.name.compareTo(b.name);
    }
}
class SortByAge implements Comparator<Student>{
    public int compare(Student a, Student b){
        return a.age-b.age;
    }
}
public class TestComparable {
    public static void main(String[] args){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(101, "Ram", 21));
        list.add(new Student(102, "Shyam", 22));
        list.add(new Student(103, "Amit", 23));
        list.add(new Student(104, "Rahul", 24));
        list.add(new Student(105, "Anil", 25));
        System.out.println("Original List: ");
        System.out.println(list);

        // Natural sorting by id (Comparable)
        Collections.sort(list);
        System.out.println("Natural sorting by id (Comparable)");
        System.out.println(list);

        // Custom Sorting by name (Comparator)
        Collections.sort(list, new SortByName());
        System.out.println("Custom Sorting by name (Comparator)");
        System.out.println(list);

        // Custom Sorting by age (Comparator)
        Collections.sort(list, new SortByAge());
        System.out.println("Custom Sorting by age (Comparator)");
        System.out.println(list);
    }
}
