package String_Question;

public class VovelsAndConsonant{
    public static void main(String[] args) {
      String str = "abhubhav";
      count(str);

    }

    public static void count(String str){
        int vovels = 0;
        int consonant = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch>='a' && ch<='z'){
                if (ch=='a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u'){
                    vovels++;
                }else consonant++;
            }

        }

        System.out.println("vovels in the given string is : " + vovels);
        System.out.println("consonant in given String is : " + consonant);
    }

}
