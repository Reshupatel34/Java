import java.util.HashSet;
public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        HashSet<Integer> rowsetbit=new HashSet<>();
        HashSet<Integer> colsetbit=new HashSet<>();

        for(int i=0;i<matrix.length;i++){
            for( int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rowsetbit.add(i);
                    colsetbit.add(j);
                }
            }
        }
        for(int i:rowsetbit){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]!=0){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i:colsetbit){
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][i]!=0){
                    matrix[j][i]=0;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
               System.out.print(matrix[i][j]+" ");
           }
        }
    }
}
