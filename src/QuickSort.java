public class QuickSort {
    public static void quicksort(int[] arr, int si,int ei){
        if(si>=ei)return;
        int pivotIdx=partition(arr,si,ei);
        quicksort(arr,si,pivotIdx-1);
        quicksort(arr,pivotIdx+1,ei);

    }
    public static int partition(int[] arr,int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int[] arr={12,11,13,4,5};
        quicksort(arr,0,arr.length-1);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
