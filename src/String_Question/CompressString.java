package String_Question;

public class CompressString {
    public static void main(String[] args) {
        String str = "aaabbccd"; //
        String result = compress(str);
        System.out.println(result);

    }

    public static String compress(String str){
        int count = 0;
        StringBuilder st = new StringBuilder();
        char ch = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch){
                count++;
            }else{
                st.append(ch);
                if (count>1){
                    st.append(count);
                    count = 1;
                }
                ch = str.charAt(i);
            }

            if (i==str.length()-1){
                ch = str.charAt(i);
                st.append(ch);
                if (count>1){
                    st.append(count);
                    count = 1;
                }
            }

        }

        return st.toString();
    }
}
