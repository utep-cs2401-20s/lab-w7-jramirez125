public class SortOfSort {

    public static void sortOfSort(int[] arr) {
        int n = arr.length - 1;
        int idx = 0;
        int beg = 0;
        int last = 0;

        int path = 0;
        //this for loop first goes through all elements
        for(int i = 0; i < arr.length; i++){
            for(int k = beg + 1; k < arr.length - last; k++){
                if(arr[idx] < arr[k]){
                    idx = k;
                }
            }
            //base case that returns the array if the length is 1 or 0.
            if(arr.length <= 1){
                return;
            }

            //when the path is 2 or 3 this is the 2nd and third largest they are placed in the beggining of the array
            //again by using helper method
            if(path == 2 || path == 3){
                swap(arr, beg, idx);
                beg++;
            }
            //runs this with helper method and swaps the largest to the end when path is 0 and 1
            //last increases by one to go left one more each time
            else {
                swap(arr,n - last, idx);
                last++;
            }
            //index then becomes beg
            idx = beg;
            //path increases by one each time
            path++;
            //when finally path reaches four, the max in array then becomes 0 repeats the process
            //in the past else condition with the last still being in the same position
            if(path == 4){
                path = 0;
            }
        }
    }
    //helper method to swap elements in array
    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    //print elements in array
    public static void printArray(int sort[]) {
        int n = sort.length;
        for (int i = 0; i < n; i++) {
            System.out.print(sort[i] + "  ");
        }
    }

    public static void main(String[] args) {
        SortOfSort arrayRun = new SortOfSort();
        int arrayOne[] = {12, 54, 78, 90, 20, 40, 10, 2};
        sortOfSort(arrayOne);
        System.out.println("SORT OF SORTED:");
        printArray(arrayOne);
    }
}