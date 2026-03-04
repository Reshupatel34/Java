import java.util.*;
public class POD1582SpecialPositionsInABinaryMatrix {
    public static void main(String[] args) {
        int[][] mat={{1,0,0},
                     {0,1,0},
                     {0,0,1}};
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    // up
                    int k=i;
                    int l=j;
                    boolean flag1=true;
                    boolean flag2=true;
                    boolean flag3=true;
                    boolean flag4=true;
                    while (k > 0) {
                        k--;
                        if (mat[k][l] != 0)  {
                            flag1=false;
                            break;
                        }

                    }
                    k=i;

                    // down
                    while (k<mat.length-1) {
                        k++;
                        if (mat[k][l] != 0) {

                            flag2 = false;
                            break;
                        }

                    }
                    // left
                    k=i;
                    while (l > 0) {
                        l--;
                        if (mat[k][l] != 0) {

                            flag3 = false;
                            break;
                        }


                    }
                    l=j;
                    // right
                    while (l< mat[0].length-1) {
                        l++;
                        if (mat[k][l] != 0) {

                            flag4 = false;
                            break;
                        }

                    }
                    if(flag1 && flag2 && flag3 && flag4){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
