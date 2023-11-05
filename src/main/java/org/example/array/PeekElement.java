package org.example.array;

public class PeekElement {
    public static void main(String[] args) {

//        Find a peak element which is not smaller than its neighbours
//        Input: array[]= {5, 10, 20, 15}
//        Output: 20
//        Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.
//        Input: array[] = {10, 20, 15, 2, 23, 90, 67}
//        Output: 20 or 90
//        Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, similarly 90 has neighbors 23 and 67.
//        Note: If the array is increasing then just print the last element will be the maximum value.
        int[] arr1 = {5, 10, 20, 15};
        int[] arr2 = {10, 20, 15, 2, 23, 90, 67};
        int[] arr3 = {1,2,3,4,5};
        findPeek(arr3);
    }

    public static void findPeek(int[] arr) {
        int peek = 0;
        if (arr.length == 1) {
            System.out.println(arr[0]);
        }

        if (arr[0] > arr[1]) {
            System.out.println(arr[0]);
        }

        if (arr[arr.length - 1] > arr[arr.length - 2]) {
            System.out.println(arr[arr.length - 1]);
        }

        for (int i = 1; i < arr.length - 1; i++) {
            peek = arr[i];
            if (arr[i - 1] < peek && arr[i + 1] < peek) {
                peek = arr[i];
                System.out.println(peek);
            }

        }

    }

}
