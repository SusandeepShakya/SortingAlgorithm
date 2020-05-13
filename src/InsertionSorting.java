public class InsertionSorting {
    public static void main(String args[]){
        int arr[] = {2,55,36,26,35,15,48};
        insertSort(arr);
    }
    public static int[] insertSort(int arr[]){
        for(int i = 0; i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while(j > 0 && temp < arr[j] ){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
            printArray(arr);
        }
        return arr;
    }
    public static void printArray(int arr[])
    {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
