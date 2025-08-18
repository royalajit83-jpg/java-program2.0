public class OddEvenWithoutOprator {
    public static void main(String[] args) {
        int n = 6;
       if ( isOddEvenSub(n)){
           System.out.println("true");

       }else{
           System.out.println("false");
       }

    }

    public static boolean isOddOrEven(int n){
        if ((n & 1)==0) return true;

        return false;
    }

    public static boolean isOddEvenSub(int n){
//        if (n<0)n = -n;
        while (n>1){
            n = n-2;
        }

        return n ==0;
    }
}
