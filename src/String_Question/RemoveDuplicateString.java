package String_Question;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String str = "aaaabbbcc";
        int j = 0;
        String s = "";
        s+=str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch!=str.charAt(j++)){
                s+=ch;
            }
        }
        System.out.println(s);
    }
}
