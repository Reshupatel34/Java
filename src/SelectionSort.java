public class SelectionSort {


    public static void main(String[] args) {
        int[] arr={785288456,512312331,912312311,212312231,831231231};
        for(int i=0;i<arr.length-1;i++){
            int min=arr[i];
            int idx=i;
            for(int j=i;j<arr.length;j++){
                if(min>arr[j]){
                min=arr[j];
                idx=j;}

            }
           // swap
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
}
