class Greeting{
    String str;
    String name;
    Greeting(String str, String name){
        this.str = str;
        this.name = name;
    }
    // @Override // --> optional
    public String toString(){
        return "Hello "+name+", "+str+"!";
    }
    public boolean isAnagram(){
        char[] arr = new char[26];
        str = str.toLowerCase();
        name = name.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            ch -= 97;
            arr[ch]++;
        }
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            ch -= 97;
            arr[ch]--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((str == null) ? 0 : str.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Greeting other = (Greeting) obj;
        if (str == null) {
            if (other.str != null)
                return false;
        } else if (!str.equals(other.str))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    } 
}
public class toString {
    public static void main(String[] args){
        Greeting g = new Greeting("Morning","Romning");
        System.out.println(g);
        System.out.println(g.isAnagram());
    }
}
