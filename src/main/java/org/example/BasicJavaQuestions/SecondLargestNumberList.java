package org.example.BasicJavaQuestions;

import java.util.Arrays;

public class SecondLargestNumberList {
    static void print2largest(int arr[], int arr_size) {
        int i, first, second;
        if (arr_size < 2) {
            System.out.print(" Invalid Input ");
            return;
        }
        Arrays.sort(arr);
        for (i = arr_size - 2; i >= 0; i--) {
            if (arr[i] != arr[arr_size - 1]) {
                System.out.printf("The second largest " + "element is %d\n", arr[i]);
                break;
            }
        }
        System.out.print("There is no second " + "largest element\n");
    }

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 0, 34, 10, 34, 1};
        int n = arr.length;
        print2largest(arr, n);
    }
}
