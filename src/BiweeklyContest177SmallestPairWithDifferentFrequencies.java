import java.util.*;
public class BiweeklyContest177SmallestPairWithDifferentFrequencies {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,3};
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int minofX=nums[0];
        for(int i=1;i<nums.length-1;i++){
            if( map.get(minofX)!=map.get(nums[i+1]) ){
                return new int[]{minofX,nums[i+1]};
            }

        }
        return new int[]{-1,-1};
    }
}
