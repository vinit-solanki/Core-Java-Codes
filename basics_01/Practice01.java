package basics_01;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        // count digit in a number
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number:");
        // int n = in.nextInt();
        // System.out.println("Enter the digit:");
        // int k = in.nextInt();
        // int num = n;
        // int cnt = 0 ;
        // while(num!=0){
        //     int rem = num%10;
        //     if(rem == k){
        //         cnt++;
        //     }
        //     num /=10;
        // }
        // System.out.println(k+" occures "+cnt+" times in "+n);

        // Reverse a number:
        System.out.print("Enter your number:");
        int n = in.nextInt();
        int temp = 0;
        int rev = 0;
        while(n>0){
            temp = n%10;
            rev = rev*10 + temp;
            n/=10;
        }
        System.out.println("Reversed Number: "+rev);
        in.close();
    }
}
