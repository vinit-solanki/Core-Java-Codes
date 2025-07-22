interface A{
    default void display(){
        System.out.println("Display-A");
    }
}
interface B extends A{
    @Override
    default void display(){
        System.out.println("Display-B");
    }
}
interface C extends A{
    @Override default void display(){
        System.out.println("Display-C");
    }
}
class D implements B,C{
    @Override
    public void display(){
        System.out.println("Display-D, Resolved manually");
        B.super.display();
    }
}
class DiamondProblemDemo{
    public static void main(String args[]){
        D d1 = new D();
        d1.display();
    }
}