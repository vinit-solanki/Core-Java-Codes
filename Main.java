import java.util.Scanner;

public class Main{
 public static void main(String args[]){
        System.out.println("Hello World!");
        System.out.println("Enter your name:");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("My name is "+name);
        input.close();
    }
}