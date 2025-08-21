public class ForNow {
    public static void main(String[] args) {
        int[] arr = {1,0,3,2,0,4};
        int[] result = moveZero(arr);
        for (int i : result){
            System.out.print(i+" ");
        }
    }

    public static int[] moveZero(int[] arr){
        int count = 0; // index to place non-zero elements

        // Step 1: Copy non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        // Step 2: Fill remaining places with zeros
        while (count < arr.length) {
            arr[count++] = 0;
        }

        return arr;
    }
}
