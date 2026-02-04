import java.util.*;
public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums={-1,0,1,2,-1,-4};
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        System.out.print("nums[i]: "+nums[i]+"+"+"nums[j]: "+nums[j]+"+"+"nums[k]: "+nums[k]);
                        flag=true;

                    }

                }
            }
        }
        if(flag){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
    }
}
