public class recurssionFactorial {

    public static int helper(int n,int acc){
        if(n==0) return 1;

        return helper((n-1),n*acc);
    }
    public static void main(String[] args) {

        int n=5;
        int ans=helper(n,1);
        System.out.println(ans);
    }
}

//tail recurssion