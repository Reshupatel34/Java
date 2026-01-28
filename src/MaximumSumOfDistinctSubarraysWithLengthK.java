import java.util.*;

public class MaximumSumOfDistinctSubarraysWithLengthK {

    public static void main(String[] args) {
        int[] nums={1,1,4,2,9,9,9};
        int k=3;
//        List<Long> list=new ArrayList<>();
//
//        int i=0;
//
//        while(i++<nums.length-k){
//
//            HashMap<Integer,Integer> map=new HashMap<>();
//
//            long sum=0;
//            for(int j=i;j<i+k;j++){
//                if(map.containsKey(nums[j])){
//                    sum=0;
//                    break;
//                }
//                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
//                sum+=nums[j];
//            }
//            list.add(sum);
//
//        }
//        long max=0;
//        for(int j=0;j<list.size();j++){
//            max=Math.max(max,list.get(j));
//        }
        List<Long> list=new ArrayList<>();

        //   int i=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        long sum=0;
        for(int i=0;i<k;i++){
            if(map.containsKey(nums[i])){
                sum=0;
                break;
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            sum+=nums[i];
        }
        list.add(sum);
        for(int i=k;i<nums.length;i++){
            map.remove(nums[i-k]);
            if(!map.containsKey(nums[i])){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                sum-=nums[i-k];
                sum+=nums[i];
            }



            list.add(sum);

        }
        long max=0;
        for(int l=0;l<list.size();l++){
            max=Math.max(max,list.get(l));
        }
        System.out.println(max);
    }
}
