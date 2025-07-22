package basics_03;

public class string01 {
    public static void main(String[] args) {
        System.out.println("These are stored in string pool"); 
        String name = "Vinit";
        System.out.println("Address of 'Vinit' in string pool: " + System.identityHashCode(name));
        name = "Vinit Solanki";
        System.out.println("Address of 'Vinit Solanki'' in string pool: " + System.identityHashCode(name));
        
        System.out.println("These are stored in heap mmy");
        String str = new String("Vinit");
        System.out.println(str);
        System.out.println("Address of 'Vinit' in heap mmy: " + System.identityHashCode(str));
        // The previous string "Vinit" is not destroyed by the garbage collector yet, 
        // as it is still referenced by the variable str.
        str = "Vinit Solanki";
        System.out.println(str);
        System.out.println("Address of 'Vinit Solanki' in heap mmy: " + System.identityHashCode(str));

        String a = "Mia";
        String b = "Mia";
        System.out.println("Address of "+a+" "+System.identityHashCode(a));
        System.out.println("Address of "+b+" "+System.identityHashCode(b));
    }
}
