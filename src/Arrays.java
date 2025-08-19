public class Arrays {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,4,4,5,6,7,8};
        int n = removeDuplicates(arr);
//        for (int i : arr){
//            System.out.print(i+" ");
//        }

        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i]+" ");

        }
    }

    public static int removeDuplicates(int[] arr){
        int j = 0;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }

    public static int[] reverseArray(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        
        
        return arr;
    }
}
