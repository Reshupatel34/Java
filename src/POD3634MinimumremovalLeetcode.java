import java.util.*;
public class POD3634MinimumremovalLeetcode {
    public static void main(String[] args) {
        int[] nums={3,1,2,6};
        int k=3;
        Arrays.sort(nums);

        int right=0;
        int minlength=nums.length;
        for(int left=0;left<nums.length;left++){
            //    check if max<=k*min

            while( right<nums.length && nums[right]<=(long) nums[left] * k){
                right++;
            }
            minlength=Math.min(minlength,nums.length-(right-left));
        }

        System.out.println(minlength);
    }
}
