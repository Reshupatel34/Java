public class TrionicArrayI {
    public static void main(String[] args) {
        int[] nums={1,3,4,3,1,5,6};

        if(nums.length<=3) System.out.println("arr is short ");;
        boolean peak1=false;
        boolean peak2=false;
        boolean valley=false;
        int i=0;
        while(i<nums.length-1){

            if(nums[i]<nums[i+1]){
                peak1=true;

            }
            else{
                break;
            } i++;

        }
        int j=i;
        while(j<nums.length-1){

            if(nums[j]>nums[j+1]){
                valley=true;
            }
            else{
                break;
            }
            j++;
        }
        int k=j;
        while(k<nums.length-1){

            if(nums[k]<nums[k+1]){
                peak2=true;
            }
            else{
                break;
            }k++;
        }
        System.out.println(peak1 && peak2 && valley &&k==nums.length-1);
    }
}
