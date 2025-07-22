@FunctionalInterface
interface Operation{
    int apply(int a, int b);
}
public class FunctionalInterfaceDemo{
    public static void main(String[] args){
        Operation add = (a, b) -> a + b;
        System.out.println(add.apply(10, 20));
        Operation sub = (a,b)-> a-b;
        System.err.println(sub.apply(10,10));
        Operation multiply = (a,b) -> a*b;
        System.out.println(multiply.apply(10,10));
        Operation divide = (a,b) ->{
            if(b==0) throw new ArithmeticException("Divide by zero");
            return a/b;
        };
        System.out.println(divide.apply(10,10));
    }
}