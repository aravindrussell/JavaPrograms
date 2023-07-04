package org.example.BasicJavaQuestions;

import java.util.*;

public class SecondLargestNumberList {
    static int print2largest(int arr[]) {
        int i, first, second;
        if (arr.length < 2) {
            System.out.print(" Invalid Input ");
        }
        Arrays.sort(arr);
        int secondLargestNumber = 0;
        for (i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                secondLargestNumber = arr[i];
                break;
            }
        }
        return secondLargestNumber;
    }

    public static int SecondLargestNumber(int numberArray[]){
        Arrays.sort(numberArray);
        int secondLargeNumber = 0;
        for (int i=numberArray.length-2; i>=0; i--){
            if (numberArray[i] != numberArray[numberArray.length -1]){
                secondLargeNumber = numberArray[i];
                break;
            }
        }
        return secondLargeNumber;
    }

    public static Integer SecondLargestNumberUsingSet(Integer arr[]){
        List<Integer> arrList = Arrays.asList(arr);
        Collections.sort(arrList);
        Set arrSets = new LinkedHashSet<>(arrList);
        List<Integer> arrListSort = new LinkedList<>(arrSets);
        return arrListSort.get(arrListSort.size() - 2);
    }

    public static void main(String[] args) {
        int arr[] = {-12, -35, -1, 0, -34, -10, -34, -1};
        System.out.println("Second largest number : " + SecondLargestNumber(arr));
        Integer arrList[] = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        System.out.println("Second largest number : " + SecondLargestNumberUsingSet(arrList));
    }
}
