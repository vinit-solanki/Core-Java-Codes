import java.util.*;
class CustomString{
    String name;
    int len;
    CustomString(String name, int len){
        this.name = name;
        this.len = len;
    }
    public String capitalize(String str, int n){
        this.name=str;
        this.len=n;
        System.out.println("Old String:"+str);
        str=str.toUpperCase();
        return str;
    }
    public String reverse(){
        String rev="";
        for(int i=len-1;i>=0;i--){
            rev+=name.charAt(i);
        }
        return rev;
    }
}
public class StringClass {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();
        CustomString str = new CustomString(inputStr,inputStr.length()); 
        System.out.println(str.name);
        System.out.println(str.len);
        str.name=str.capitalize(str.name, str.len);
        System.out.println(str.name);
        System.out.println(str.reverse());
        in.close();
    }
}
