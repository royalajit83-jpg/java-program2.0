import java.util.HashSet;

public class FindTheMIssingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9,11,14};
        int result = findUsingFormula(arr);
        System.out.println(result);
    }

    public static int findUsingFormula(int[] arr){
        int arr_sum = 0;
        int n = arr.length+1;
        for (int i = 0; i < arr.length; i++) {
            arr_sum = arr_sum + arr[i];
        }
        int expected_sum = n *(n+1)/2;
        int missing = expected_sum - arr_sum ;

        return missing;
    }
    public static void findUsingBoolean(int[] arr){
        int n = 14;
        boolean[] present = new boolean[n+1];

        for (int i : arr){
            present[i] = true;
        }
        System.out.println("missing : ");

        for (int i = 1; i <= n ; i++) {
            if (!present[i]){
                System.out.print(i+ " ");
            }
        }
    }

    public static void findUsingSet(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        int n = 14;
        for (int i: arr){
            set.add(i);
        }

        for (int i= 1; i <= n;i++){
            if(!set.contains(i)){
                System.out.println(i+" ");
            }
        }
    }
}
