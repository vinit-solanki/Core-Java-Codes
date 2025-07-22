package basics_01;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = input.nextLine();
        System.out.print("Enter your age:");
        String age = input.nextLine();
        System.out.print("Enter your salary:");
        String salary = input.nextLine();
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+salary);
        input.close();
    }}