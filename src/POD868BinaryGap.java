import java.util.*;

public class POD868BinaryGap {
    public static void main(String[] args) {
        int n=22;
        String bits = Integer.toBinaryString(n);

        int left = 0;
        int right = 1;
        int distt = 0;
        while (left < bits.length() && right < bits.length()) {
            if (bits.charAt(left) == '1' &&
                    bits.charAt(right) == '1') {
                distt = Math.max(distt, right - left);
                left=right;

            }

            right++;



        }
        System.out.println(distt);
    }
}
