import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fetchNumber {
    public static void main(String[] args) {
        List<Integer> ll = Arrays.asList(10,15,8,null,49,99,11);
        ll.stream().filter(e->e!=null && e.toString().startsWith("1"))
                .forEach(System.out::println);
    }
}
