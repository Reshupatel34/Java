public class BubbleSort {
    public static void main(String[] args){
//        int[] arr={13,46,24,52,20,9};
        int[] arr={0,1,0,3,12,0,8,0,0};

        for(int i=arr.length-1;i>=0;i--){
            for(int j=1;j<=i;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp=arr[j+1];
//                    arr[j+1]=arr[j];
//                    arr[j]=temp;
//                }
                if(arr[j-1]==0 && arr[j]!=0){
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
            }


        }
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
}
