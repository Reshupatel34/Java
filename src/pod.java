import java.util.*;
public class pod {


        public static void main(String[] args) {
            int[] nums={1,1,2,2,3,3};
            Arrays.sort(nums);
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            int x=nums[0];
            for(int i=1;i<nums.length;i++){
                if(x<nums[i] && !Objects.equals(map.get(x), map.get(nums[i]))){
                    System.out.println(x+" "+nums[i]);
                }
            }

            System.out.println( "mon");
        }
    }

