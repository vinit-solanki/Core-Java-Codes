package basics_01;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = input.nextInt();
        System.out.println("Enter b:");
        int b = input.nextInt();
        System.out.println("Enter c:");
        int c = input.nextInt();
        
        if (a > b && a > c) {
            System.out.println("a is largest");
        } else if (b > a && b > c) {
            System.out.println("b is largest");
        } else if (c > a && c > b) {
            System.out.println("c is largest");
        } else if (a == b && a == c) {
            System.out.println("a, b and c are equal");
        } else if (a == b) {
            System.out.println("a and b are equal");
        } else if (a == c) {
            System.out.println("a and c are equal");
        } else if (b == c) {
            System.out.println("b and c are equal");
        }
        
        System.out.println("Char-Checker:");
        System.out.println("Enter your character:");
        char ch = input.next().trim().charAt(0);        
        if(ch>=97&&ch<=122){
            System.out.println("Lower Case");
        } else{
            System.out.println("Upper Case");
        }
        input.close();
    }
}
