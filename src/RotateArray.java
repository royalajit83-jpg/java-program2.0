public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr,k);
    }

    public static void rotate(int[] arr, int k){
        int n = arr.length;
      reverseArr(arr,0,n-1);

      reverseArr(arr,0,k-1);

      int[] result = reverseArr(arr,k,n-1);

        System.out.print("[");
      for (int i : result){
          System.out.print( i + " ");
      }
        System.out.print("]");
    }

    public static int[] reverseArr(int[] arr,int left ,int right){

      while (left < right){
          int temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;
          left++;
          right--;
      }

      return arr;

    }
}
