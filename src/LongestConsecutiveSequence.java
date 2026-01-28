import java.util.*;
public class LongestConsecutiveSequence {
    public static void main(String[] args) {

   int[] nums={100,4,200,1,3,2,5};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){

            set.add(nums[i]);

        }
        int max=0;
//        for(int i=0;i<nums.length;i++){
//            int length=1;
//            int left=nums[i],right=nums[i];
//            while(set.contains(left-1) ){
//
//                left-=1;
//                length++;
//
//                System.out.print(" left side : "+nums[i]+" length : "+length);
//
//            }
//            while(set.contains(right+1)){
//                right+=1;
//                length++;
//                System.out.print(" right side : "+nums[i]+" length : "+length);
//            }77777777777
//            max=Math.max(length,max);
//            System.out.print(max+" ");
//            System.out.println();
////            break;
//        }


//        better appraoch

        for (int i :set) {
            int length = 1;
            int right = i;
            if(!set.contains(i-1)){
                while (set.contains(right + 1)) {
                    right +=1;
                    length++;
                }
                max = Math.max(length, max);
            }


        }
        System.out.println(max);
    }
}
