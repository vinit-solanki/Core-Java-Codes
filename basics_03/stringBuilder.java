package basics_03;

import java.util.Scanner;

public class stringBuilder {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder();
        // sb.append("Vinit");
        // sb.insert(5,"Solanki");
        // sb.insert(5, " ");
        // System.out.println(sb);
        // sb.setLength(30);
        // System.out.println(sb.capacity());
        // sb.setCharAt(5, '-');
        // System.out.println(sb.toString());

        Scanner in = new Scanner(System.in);
        // StringBuilder sb = new StringBuilder(in.nextLine());
        // toggle a string:
        // for(int i=0;i<sb.length();i++){
        // char c = sb.charAt(i);
        // if(c == ' '){
        // continue;
        // } else if(c>=97 && c<=122){
        // c-=32;
        // } else if(c<=90 && c>=65){
        // c+=32;
        // }
        // sb.setCharAt(i, c);
        // }
        // System.out.println(sb);

        // pallindrome cnt:
        // int cnt = 0;
        // String str = in.nextLine();
        // for(int i=0;i<str.length();i++){
        // for(int j=i;j<str.length();j++){
        // String subStr = str.substring(i, j+1);
        // if( isPalindrome(subStr) ){
        // cnt++;
        // System.out.print(subStr + " ");
        // }
        // }
        // }
        // System.out.println(cnt);

        // reverse each word in a string:
        // String str = in.nextLine();
        // String ans = "";
        // for(int i=0;i<str.length();i++){
        // int j=i+1;
        // while(j<str.length() && str.charAt(j) != ' '){
        // j++;
        // }
        // String subStr = str.substring(i, j);
        // subStr = reverseStr(subStr);
        // ans += subStr + " ";
        // i = j;
        // }
        // System.out.println(ans);

        // Compress string:
        System.out.println(compressString("aaabbbc"));
        in.close();
    }

    public static String reverseStr(String str) {
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        int s = 0;
        int e = str.length() - 1;
        while (s < e) {
            if (str.charAt(s) != str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public static String compressString(String str) {
        String ans = "";
        for(int i=0;i<str.length();i++){
            int cnt = 1;
            char ch = str.charAt(i);
            while(i+1<str.length() && str.charAt(i+1) == ch){
                cnt++;
                i++;
            }
            ans += ch; 
            ans += cnt;
        }
        return ans;
    }
}
