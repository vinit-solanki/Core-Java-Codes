import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class rearrange_string{
    public static String solve(String str){
        int n = str.length();
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++){
            char ch = str.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        char[] ans = new char[n];
        int index = 0;
        for(Map.Entry<Character, Integer> entry: freq.entrySet()){
            char ch = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++){
                if(index>=n) index=1;
                ans[index] = ch;
                index+=2;
            }
        }
        return new String(ans);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = in.nextLine();
        String rearranged = solve(str);
        System.out.println("Rearranged string: " + rearranged);
        in.close();
    }
}