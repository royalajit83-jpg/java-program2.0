import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        int num = 19;
        if (isHappy(num)) {
            System.out.println(num + " is a Happy Number");
        } else {
            System.out.println(num + " is not a Happy Number");
        }
    }

    public static boolean isHappy(int n){
        HashSet<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)){
            seen.add(n);
            n = getSquare(n);
        }

        return n ==1;
    }

    public static int getSquare(int num){
        int pro = 0;

        while (num!=0){
            int lastDigit = num %10;
            pro = pro + (int)Math.pow(lastDigit,2);
            num/=10;
        }
       return pro;
    }


}

