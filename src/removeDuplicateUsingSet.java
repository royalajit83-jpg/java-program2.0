import java.util.HashSet;

public class removeDuplicateUsingSet {
    public static void main(String[] args) {
        int[] arr = {10,15,15,20,30,10};
        int result = remove(arr);
        for (int i = 0; i < result; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int remove(int[] arr){
        HashSet<Integer>  set = new HashSet<>();
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (!set.contains(arr[i])){
                set.add(arr[i]);
                arr[j++] = arr[i];
            }
        }
        return j;
    }
}
