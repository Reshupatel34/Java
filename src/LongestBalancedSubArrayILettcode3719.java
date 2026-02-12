import java.util.*;

public class LongestBalancedSubArrayILettcode3719 {
    public static void main(String[] args) {
        int[] nums={3,2,2,5,4};
        int right = 0;
        int evenCount = 0;
        int oddCount = 0;
        int maxlen = 0;
        HashSet<Integer> set = new HashSet<>();
        while (right < nums.length) {
            //if even check whether it already exists and if not then evenCount++;
            if(!set.contains(nums[right])){
                if (nums[right] % 2 == 0) {
                     evenCount++;
                    System.out.print("evenCount : "+evenCount+" ");
                } //for odd numbers
                else if (nums[right] % 2 != 0) {
                   oddCount++;
                    System.out.print("oddCount : "+oddCount);

                }
                set.add(nums[right]);
            }


            //now check whether the oddcount and evencount are equal , and if so then increase the store the size of current window
            if (evenCount == oddCount) {
                maxlen = Math.max(maxlen, evenCount + oddCount);
            }
            right++;
        }
        System.out.println(maxlen);
    }
}
