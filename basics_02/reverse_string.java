import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = in.nextLine();
        // System.out.println(str.charAt(0));
        String name = "Vinit Solanki";
        name.charAt(0);
        int s = 0;
        int e = str.length() - 1; 
        while(s<e){
            // System.out.println(str.charAt(s)+" "+ str.charAt(e));
            char temp = str.charAt(s);
            str = str.substring(0, s) + str.charAt(e) + str.substring(s + 1);
            str = str.substring(0, e) + temp + str.substring(e + 1);
            s++; e--;
        }
        System.out.println("Reversed String: "+str);
        in.close();
    }
}
