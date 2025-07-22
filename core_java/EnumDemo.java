import java.util.*;

enum days{
    mon, tues, wed, thrus, fri, sat, sun;
}
enum Status{
    Pending("Order received"),
    Processing("Order is being prepared"),
    Shipped("Order is out for delivery"),
    Delivered("Order has been delivered"),
    Returning("Order is being returned");
    private final String description;
    Status(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
    public boolean isFinalStatus(){
        return this==Delivered || this==Returning;
    }
}
class Order{}
class EnumDemo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter day:");
        // String day = in.nextLine();
        // days d = days.valueOf(day);
        // switch(d){
        //     case mon: System.out.println("Work");
        //                 break;
        //     case tues: System.out.println("Work");
        //                 break;
        //     case wed: System.out.println("Work");
        //                 break;
        //     case thrus: System.out.println("Work");
        //                 break;
        //     case fri: System.out.println("Work");
        //                 break;
        //     case sat: System.out.println("Rest");
        //                 break;
        //     case sun: System.out.println("Rest");
        //                 break;
        //     default: System.out.println("Invalid day");
        // };

        in.close();        
    }
}