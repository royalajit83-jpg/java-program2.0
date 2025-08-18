package Test_August.String;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromStr {
    public static void main(String[] args) {
        String str = "aaaabbbccddffggggrrr";// abcd
        String strs = "";
        strs+=str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i)!=str.charAt(i-1)){
                strs+=str.charAt(i);

            }
        }

        System.out.println(strs);
    }



}
