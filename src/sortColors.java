public class sortColors {

    public static void main(String[] args) {


        int[] nums = {0, 1, 2, 0, 1, 2};
//        int countZero = 0;
//        int countOne = 0;
//        for (int num : nums) {
//            if (num == 0)
//                countZero++;
//            else
//                countOne++;
//        }
        // int countTwo=nums.length-(countZero-countOne);
        int countZero=0;
        int countOne=0;
        int countTwo=0;
        for(int num:nums){
            if(num==0)
                countZero++;
            else if(num==2)
                countTwo++;
            else
                countOne++;
        }
       int idx=0;

        while(countZero-->0){
            nums[idx++]=0;
        }
        while(countOne-->0){
            nums[idx++]=1;
        }
        while(countTwo-->0){
            nums[idx++]=2;
        }
        for (int l = 0; l < nums.length; l++) {
            System.out.print(nums[l] + " ");

        }
    }
}