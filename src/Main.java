public class Main {
    public static void main(String[] args) {
        int[] arr = {5,7,6,1,6,8,2};
        int[] result = SelectionSort(arr);
        for(int i : result){
            System.out.print(i + " ");
        }


    }

    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length -i -1; j++) {
                if (arr[j] > arr[j+1]){
                    int tem = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tem;
                }
            }
        }

        return arr;
    }


    public static int[] SelectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int max = i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j] < arr[max]){
                    max =j;

                }
            }

            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

        }

        return arr;
    }

}