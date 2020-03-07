import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortOfSortTest {

    //here I test the inputs with all even positive, numbers. test passes
    @Test
    public void SortOfSortTest1(){
        SortOfSort test = new SortOfSort();
        int[] array1 = {12, 10, 8, 6, 4, 2}; //
        int[] result = {8, 6, 2, 4,10 ,12};
        test.sortOfSort(array1);
        for (int i = 0; i < array1.length; i++) {
            assertEquals(result[i], array1[i]);
        }
    }
    //here I test with the inputs being odd numbers with a length of the array being odd. Test passes
    @Test
    public void SortOfSortTest2(){
        SortOfSort test = new SortOfSort();
        int[] array1 = {3, 6, 9, 12, 15, 18, 21, 24, 27}; //
        int[] result = {21, 18, 9, 6, 3, 12, 15, 24, 27};
        test.sortOfSort(array1);
        for (int i = 0; i < array1.length; i++) {
            assertEquals(result[i], array1[i]);
        }
    }
    //here I test with the inputs having negative numbers, a zero and one number being repeated. Test passes.
    @Test
    public void SortOfSortTest3(){
        SortOfSort test = new SortOfSort();
        int[] array1 = {-1, 0, 2, 2, 3, -10}; //
        int[] result = {2, 0, -10, -1, 2, 3};
        test.sortOfSort(array1);
        for (int i = 0; i < array1.length; i++) {
            assertEquals(result[i], array1[i]);
        }
    }
    //here I test with the same numbers but being positive and negative. Test passes
    @Test
    public void SortOfSortTest4(){
        SortOfSort test = new SortOfSort();
        int[] array1 = {-1, -20, -100, 1, 20, 100}; //
        int[] result = {1, -1, -100, -20, 20, 100};
        test.sortOfSort(array1);
        for (int i = 0; i < array1.length; i++) {
            assertEquals(result[i], array1[i]);
        }
    }

    //here I test with the inputs being only zeros and ones, the trick in this one was
    //having the fifth largest be the one, positioned in the right. Test passes.
    @Test
    public void SortOfSortTest5(){
        SortOfSort test = new SortOfSort();
        int[] array1 = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}; //
        int[] result = {1, 1, 0, 0, 0, 0, 0, 1, 1, 1};
        test.sortOfSort(array1);
        for (int i = 0; i < array1.length; i++) {
            assertEquals(result[i], array1[i]);
        }
    }
    //here i test with a input of only one array, where in my condition of the length being
    // less than or equal to 1 returns the exact array. Test passes.
    @Test
    public void SortOfSortTest6(){
        SortOfSort test = new SortOfSort();
        int[] array1 = {10}; //
        int[] result = {10};
        test.sortOfSort(array1);
        for (int i = 0; i < array1.length; i++) {
            assertEquals(result[i], array1[i]);
        }
    }

}