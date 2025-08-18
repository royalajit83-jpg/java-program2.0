public class MoveAllZero {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int[] result = moveZero(arr);
        for (int i:result){
            System.out.print(i+" ");
        }
    }
    public static int[] moveZero(int[] nums){
        int count  = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                nums[count] = nums[i];
                count++;
            }
        }

        while (count< nums.length){
            nums[count++] = 0;
        }
        return nums;
    }
}
