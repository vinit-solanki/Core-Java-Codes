import java.util.Scanner;

public class func_basics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter num1:");
        // int num1 = in.nextInt(); 
        // System.out.println("Enter num2:");
        // int num2 = in.nextInt();
        // swap(num1,num2);        
        // System.out.println(num1+ " " +num2);
        // System.out.println("Enter Number:");
        int arm = in.nextInt();
        System.out.println(isArmstrong(arm)?"Number is an Armstrong Number":"Number is not Armstrong Number");
        in.close();
    }
    static void swap(int a, int b){
        int c = a;
        a=b;
        b=c;
        System.out.println(a+ " " +b);
    }

    static boolean isArmstrong(int n){
        int temp1 = n;
        int sum=0;
        while(n>0){
            System.out.println(n+" ");
            int temp2 = n%10; 
            sum+=(temp2*temp2*temp2);
            n/=10;
        }
        if(sum==temp1)
        return true;
        else
        return false;
    }
}
