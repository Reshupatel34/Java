public class SubarraySumBetterApproach {

    public static void main(String[] args) {

        int[] nums={8,-3,2};
        int max=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        int sum=0;

        for(int j=i;j<nums.length;j++){
            sum+=nums[j];
            System.out.print(sum+" ");
             max=Math.max(max,sum);
            System.out.print(max+" ");
        }
    }

        System.out.println(max);
        max=Math.max(-1,-9);
//        System.out.println(max);
    }
}
