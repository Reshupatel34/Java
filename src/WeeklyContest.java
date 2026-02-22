import java.util.*;
public class WeeklyContest {
    public static void main(String[] args) {
        int[] nums = {3, 1, 1, 2};
//        Arrays.sort(nums);
        List<Long> list = new ArrayList<>();


        int n = nums.length;
        int i = 0;

        while (i < n) {
            long sum = nums[i];
            int j = i + 1;

            while (j < n && nums[j] == nums[i]) {
                sum += nums[j];
                j++;
            }

            list.add(sum);
            i = j; // jump to next new number
        }

        for (long k : list) {
            System.out.println(k);
        }
    }
}