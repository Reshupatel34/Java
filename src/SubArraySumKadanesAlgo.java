public class SubArraySumKadanesAlgo {

    public static void main(String[] args) {

        int[] nums={-6,-1,-2,-9,-4};
        int sum = 0;
      int curr=nums[0];
        for (int i = 0; i < nums.length; i++) {

                 if(sum<0){
                      sum=0;
                 }
                sum+=nums[i];
                 curr=Math.max(curr,sum);

        }
        System.out.println(curr);
    }
}