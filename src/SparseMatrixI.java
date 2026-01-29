import java.util.ArrayList;
public class SparseMatrixI {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };

//        print the matrix in a spiral form
        int rows=matrix.length,cols=matrix[0].length;
        int top=0,bottom=rows-1;
        int left=0,right=cols-1;

        ArrayList<Integer> list=new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            for(int j=top+1;j<=bottom;j++){
                list.add(matrix[j][right]);
            }
            for(int k=right-1;k>=left;k--){
                list.add(matrix[bottom][k]);
            }
            for(int l=bottom-1;l>top;l--){
                list.add(matrix[l][left]);
            }
            top++;
            bottom--;
            left++;
            right--;
        }

         for(int i=0;i<list.size();i++){
             System.out.print(list.get(i)+" ");
         }
    }
}
