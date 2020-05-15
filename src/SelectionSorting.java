public class SelectionSorting {
    public static void main(String args[]){
        int array[] = {22,23,26,56,59,89,54};
        SelectionSort(array);
    }
    public static int[] SelectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // swapping
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
            printArray(array);
        }

        return array;

    }
    public static void printArray(int array[])
    {
        for (int i = 0; i <array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
