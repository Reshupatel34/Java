import java.util.*;
public class ThreeSumOptimised {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] nums={-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        int target=0;

        int i=0;

        while(i<nums.length-2){
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }

            HashSet<Integer> set=new HashSet<>();

            int j=i+1;
            while(j>i && j<nums.length){


                int r= target-nums[j]-nums[i];
//                int r= -nums[j]-nums[i];

                if(set.contains(r)){
                    list.add(Arrays.asList(nums[i],nums[j],r));
                }
                set.add(nums[j]);
                j++;
            }



            i++;
        }
        System.out.println();
        for(List<Integer> l:list){
            for(int k:l){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
