public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = 2;
        int result = element(arr,n);

    }

    public static int element(int[] arr,int n){

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=n){
                arr[j++] = arr[i];

            }
        }

        return j;
    }
}


