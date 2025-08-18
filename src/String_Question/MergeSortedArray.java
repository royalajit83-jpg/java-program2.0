package String_Question;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9};
        int[] result = merge(arr1,arr2);
        for (int i : result){
            System.out.print(i+" ");
        }

    }

    public static int[] merge(int[] arr1,int[] arr2){
        int[] arr = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr[arr1.length+i] = arr2[i];

        }

        return arr;
    }
}
