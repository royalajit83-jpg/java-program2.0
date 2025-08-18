package String_Question;

public class LastWordLength {
    public static void main(String[] args) {
        String str = "Hello how are you anubhav";
        String st = str.trim();
        int count = 0;
        for (int i = st.length()-1; i >=0; i--) {
            if (st.charAt(i) == ' ') {
                break;
            }else count++;
        }

        System.out.println(count);
    }


}
