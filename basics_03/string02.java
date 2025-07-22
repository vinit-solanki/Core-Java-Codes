package basics_03;

public class string02 {
    public static void main(String[] args) {
        String str = "Vinit";
        System.out.println("Hash code before: "+System.identityHashCode(str));
        // .next() -> Terminates when finds a space
        // String + int/char/str -> this is valid
        str+=" Solanki";
        System.out.println("Hash code after: "+System.identityHashCode(str));
        System.out.println(str);

        System.out.println(str.charAt(5));
        System.out.println(str.indexOf('i'));
        System.out.println(str.length());
        // .compareTo() -> returns the lexographical value from comparison
        System.out.println(str.compareTo(str));
        System.out.println(str.compareTo(" "));
        System.out.println(str.compareTo("Ana de Armas"));
        System.out.println(str.contains("in"));
        System.out.println(str.startsWith("so"));
        System.out.println(str.startsWith("So"));
        System.out.println(str.startsWith("V"));
        System.out.println(str.concat("-2005"));
        System.out.println(str.substring(4));
        // endIndex is exclusive
        System.out.println(str.substring(1, 3));

    }
}
