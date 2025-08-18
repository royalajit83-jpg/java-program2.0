import java.util.ArrayList;
import java.util.List;

public class SortDigit {
    public static void main(String[] args) {
        int num = 83275614;
        int sort = sort(num);
        System.out.println(sort);
    }

    public static int sort(int num) {
        int sorted_num = 0;

        List<Integer> list = new ArrayList<>();

        while (num != 0) {
            int lastDigit = num % 10;
            list.add(lastDigit);
            num /= 10;
        }


        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }

            }
        }

        for (Integer digit : list) {
            sorted_num = sorted_num * 10 + digit;
        }

        return sorted_num;
    }
}
