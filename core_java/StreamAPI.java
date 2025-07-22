import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate; 
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Product{
    int id;
    String name;
    double price;
    Product(int id,String name, double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
public class StreamAPI {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Ram", "Shyam", "Amit", "Rahul", "Anil");
        List<String> result = names.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
        System.out.println(result);

        Stream<String> s1 = names.stream();
        s1.forEach(name -> System.out.println(name.toUpperCase()));

        List<Integer> nums = Arrays.asList(4,5,2,3,5,2);
        Predicate<Integer> pred = n -> n%2 == 0;
        Function<Integer, Integer> multiplyByTwo = n -> n*2;
        int numResult = nums.stream().filter(pred).map(multiplyByTwo).reduce(0, (c,d) -> c+d);
        System.out.println("Num Result: "+numResult);
        
        List<Product> products = Arrays.asList(
            new Product(101,"Apple",100), 
            new Product(102,"Banana",200), 
            new Product(103,"Orange",300));
        List<String> result2 = products.stream()
        .filter(p -> p.price > 150)
        .map(p -> p.name)
        .collect(Collectors.toList());
        String myListOfObject = String.join(", ", products.stream().map(product -> product.name).collect(Collectors.toList()));
        System.out.println(myListOfObject);


    }
}
