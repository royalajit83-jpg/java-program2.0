public class FindUniqueElement {
    public static void main(String[] args) {
        int[] num = {1,1,2,5,3,3};
        System.out.println("unique element are : ");
        for (int i = 0; i < num.length; i++) {
            int count = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j]){
                    count++;

                }
            }

            if (count==1){
                System.out.println(num[i]);
            }

        }

    }
}