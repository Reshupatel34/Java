public class weekleycontestQ1 {
    public static void main(String[] args) {
        int[] nums={2,13,45,2,4,1,5,6};
        int count=0;

        for(int i=0;i<nums.length-1;i++){
            int average=0;

            for(int j=i+1;j<nums.length;j++){
                average+=nums[j];

            }
            if(nums[i]>average/(nums.length-1-i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
