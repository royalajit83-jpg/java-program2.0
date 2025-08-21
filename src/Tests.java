import java.util.HashSet;

public class Tests {
    public static void main(String[] args) {
        int[] arr = {1,0,3,2,0,4};
        int[] result = result(arr);
        for (int i : result){
            System.out.print(i+" ");
        }

    }

    public static int[] result(int[] arr){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                arr[count++] = arr[i];
            }
        }

        return arr;
    }
}