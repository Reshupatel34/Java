public class SubArray_BruteForce {
    public static void main(String[] args) {
        int[] nums={8,3,2};

        for(int start=0;start<nums.length;start++){
            for(int end=start;end<nums.length;end++){

                for(int k=start;k<=end;k++){
                    System.out.print(nums[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
