package String_Question;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 5;
        List<String> str = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
           if (i % 3==0 && i%5==0){
               str.add( "FizBuzz");
           }else if(i%3==0){
               str.add(  "Fizz");
           }else if (i%5==0) {
               str.add("Buzz");
           }else{
               str.add(Integer.toString(i));
           }
        }

        System.out.println(str);
    }
}
