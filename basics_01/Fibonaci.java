package basics_01;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your limit:");
        int n = input.nextInt();
        int a=0;
        int b=1;
        System.out.println("Fibonacci: ");
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=2;i<n;i++){
            int c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        input.close();
    }
}
