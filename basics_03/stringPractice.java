package basics_03;

public class stringPractice {
    public static void main(String[] args) {
        String str = "Vinit";
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                System.out.print(str.substring(i, j+1)+ " ");
            }
            System.out.println();
        }
    }
}