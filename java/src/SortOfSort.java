public class SortOfSort {

//    public static void sortTry(int[]arrOne, int n){
//        int i, key, j;
//        for (i = 1; i < n; i++)
//        {
//            key = arrOne[i];
//            j = i - 1;
//
//        /* Move elements of arrOne[0..i-1], that are
//        greater than key, to one position ahead
//        of their current position */
//            while (j >= 0 && arrOne[j] > key)
//            {
//                arrOne[j + 1] = arrOne[j];
//                j = j - 1;
//            }
//            arrOne[j + 1] = key;
//        }
//    }




    public static void sortOne(int[] sort) {
        int n = sort.length;

        for (int i = 0; i < n - 1; i++) {

            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (sort[j] < sort[min_index]) {
                    min_index = j;

                    int temp = sort[min_index];
                    sort[min_index] = sort[i];
                    sort[i] = temp;
                }
            }
        }
    }


    public static void printArray(int sort[]) {
        int n = sort.length;
        for (int i = 0; i < n; i++) {
            System.out.print(sort[i] + "  ");
        }
    }

    public static void main(String[] args) {
        SortOfSort arrayRun = new SortOfSort();
        int arrayOne[] = {12, 54, 78, 90, 20, 40, 10};
        sortOne(arrayOne);
        System.out.println("SORTED:");
        printArray(arrayOne);
    }
}