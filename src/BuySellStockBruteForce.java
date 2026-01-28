public class BuySellStockBruteForce {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
         int max=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int sub=prices[j]-prices[i];
                max=Math.max(max,sub);
            }
        }
        System.out.println(max);
    }
}
