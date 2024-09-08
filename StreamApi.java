import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamApi {
    public static void main(String[] args) {
        List<String> list = List.of( "Banana", "Orange", "Apple", "Grapes");
        Stream<String> stream = list.stream();

        String[] arr = {"Banana", "Orange", "Apple", "Grapes"};

        Stream.iterate(0,n->n+1).limit(100).forEach(System.out::println);

    
        Stream.generate(()->"Hello").limit(100).forEach(System.out::println);
        
    }
}