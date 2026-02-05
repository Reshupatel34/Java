public class POD3379Transformedarray {
    public static void main(String[] args) {
        int[] nums={-10,-10};
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                ans[i] = nums[i];
            } else {
                int idx = ((i + nums[i]) % n + n) % n;
                ans[i] = nums[idx];
            }

        }
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
