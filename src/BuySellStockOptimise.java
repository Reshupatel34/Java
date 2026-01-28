public class BuySellStockOptimise {
    public static void main(String[] args) {
        int[] nums={7,1,5,3,6,4};

        int min=nums[0];
        int max=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            int profit=nums[i]-min;
            max=Math.max(max,profit);
        }
        System.out.println(max);
    }
}
