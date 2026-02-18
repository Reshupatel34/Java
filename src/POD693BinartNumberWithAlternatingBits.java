public class POD693BinartNumberWithAlternatingBits {
    public static void main(String[] args) {
        int n=5;
        int x=n^(n>>1);
        System.out.println((x&(x+1))==0);
    }
}
