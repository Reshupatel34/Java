public class NextGreaterElement3 {
    public static void main(String[] args) {
        int n=12345;
        String num=String.valueOf(n);
        int[] nums=new int[num.length()];

        for(int i=0;i<nums.length;i++){
            nums[i]=num.charAt(i)-'0';
        }
        int pivotIdx=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]>=nums[i]){
                continue;
            }
            else{
                pivotIdx=i-1;
                break;
            }
        }
        if(pivotIdx==-1){
          //  return -1;
        }
        for(int i=nums.length-1;i>pivotIdx;i--){
            if(nums[i]>nums[pivotIdx]){
                int temp=nums[i];
                nums[i]=nums[pivotIdx];
                nums[pivotIdx]=temp;
                break;
            }
        }
        int l=pivotIdx+1;
        int r=nums.length-1;
        while(l<=r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
        long number = 0;

        for (int i = 0; i < nums.length; i++) {
            number = number * 10 + nums[i];
            if (number > Integer.MAX_VALUE) {
             //   return -1;
            }
        }

       // return (int)number;
    }
}
