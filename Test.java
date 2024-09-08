import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       List<Integer> filteredList= list.stream()
       .filter(x->x%2==0)
       .collect(Collectors.toList());
       System.out.println(filteredList);

       filteredList.stream()
       .map(x->x/2)
       .collect(Collectors.toList());
       System.out.println(filteredList);


    }
    
}
