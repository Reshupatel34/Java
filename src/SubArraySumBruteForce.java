public class SubArraySumBruteForce {
    public static void main(String[] args) {
        int[] nums={8,3,2};
        int max=0;
        for(int start=0;start<nums.length;start++){
            for(int end=start;end<nums.length;end++){
                int sum=0;
                for(int k=start;k<=end;k++){
                    sum+=nums[k];
                    System.out.print(sum+" ");
                    max=Math.max(max,sum);



                }
            }
        }
        System.out.println(max);
    }
}
