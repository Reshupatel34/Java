import java.util.*;


public class NextPermutation {
    public static void main(String[] args) {
        int[] nums={1,2,3,6,5,4,1};
        int pivotIdx=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivotIdx=i;
                break;
            }
        }

        if(pivotIdx==-1){
            Arrays.sort(nums);
//            return;
        }

        //    swap pivot and rightmost number
        for(int i=nums.length-1;i>pivotIdx;i--){
            if(nums[i]>nums[pivotIdx]){
                //    swap
                int temp=nums[pivotIdx];
                nums[pivotIdx]=nums[i];
                nums[i]=temp;
                break;

            }

        }

        // now we will reverse the elements from pivot to nums.length
        int i=pivotIdx+1;
        int j=nums.length-1;
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }

//        return;
       for(int l=0;l<nums.length;l++){
           System.out.print(nums[l]+" ");
       }

    }
}
