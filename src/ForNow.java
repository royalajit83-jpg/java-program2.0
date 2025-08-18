public class ForNow {
    public static void main(String[] args) {
        int[] arr = {1,0,3,2,0,4};
        int[] result = moveZero(arr);
        for (int i : result){
            System.out.print(i+" ");
        }
    }
    public static int[] moveZero(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                arr[count++] = arr[i];
            }

        }
        for (int i = count; i < count; i++) {
            arr[count++] = 0;

        }

        return arr;
    }
}
