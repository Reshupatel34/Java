public class CheckBalancedString3340LeetCode {
    public static void main(String[] args) {
        String num="24123";
        int sumeven=0;
        for(int i=0;i<num.length();i+=2){
            char ch=num.charAt(i);
            int n=ch-'0';
            sumeven+=n;
        }
        int sumodd=0;
        for(int i=1;i<num.length();i+=2){
            char ch=num.charAt(i);
            int n=ch-'0';
            sumodd+=n;
        }
        if(sumeven==sumodd){
            System.out.println(true);
        }
        else{
            System.out.println(false);

        }
    }
}
