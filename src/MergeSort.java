public class MergeSort {
    public static void mergesort(int[] nums,int si,int ei){
        if(si>=ei)return;
        int mid=si+(ei-si)/2;
        mergesort(nums,si,mid);
        mergesort(nums,mid+1,ei);
        merge(nums,si,mid,ei);


    }
    public static void merge(int[] nums,int si,int mid,int ei){
        int[] temp=new int[ei-si+1];
        int k=0;
        int i=si;
        int j=mid+1;
        while(i<=mid && j<=ei){
            if(nums[i]<nums[j]){
                temp[k]=nums[i];
                i++;
            }
            else{
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k]=nums[i];
            i++;k++;
        }
        while(j<=ei){
            temp[k]=nums[j];
            j++;k++;
        }

//        copy the element of the temp into main arr
        for(k=0,i=si;k<temp.length;k++,i++){
            nums[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int[] nums={6,3,9,5,2,8};
        mergesort(nums,0,nums.length-1);
        for(int num:nums)
            System.out.print(num+" ");

    }
}
