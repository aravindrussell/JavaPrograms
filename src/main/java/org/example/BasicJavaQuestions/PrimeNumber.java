package org.example.BasicJavaQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.sumGivenPrimeNumber();
//        primeNumber.checkPrimeNumber();
    }

    public void sumGivenPrimeNumber() {
        int sumOfPrimeNumber = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N value : ");
        int n = scanner.nextInt();
        List<Integer> numberList = new ArrayList<>();
        List<Integer> primeNumberList = new ArrayList<>();
        List<Integer> nonPrimeNumberList = new ArrayList<>();

        System.out.println("Enter " + n + " Numaric values");
        for (int i = 0; i < n; i++) {
            numberList.add(scanner.nextInt());
        }

        for (int number : numberList) {
            boolean flag = false;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag){
                primeNumberList.add(number);
            } else {
                nonPrimeNumberList.add(number);
            }
        }

        System.out.println("List Of prime Number : " + primeNumberList);
        for (int primeNum : primeNumberList) {
            sumOfPrimeNumber = primeNum + sumOfPrimeNumber;
        }

        System.out.println("Sum of Given prime number in the list : " + sumOfPrimeNumber);
    }

    public void checkPrimeNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to find this is aprime number or not : ");
        int num = scanner.nextInt();

        if (num == 0 || num == 1) {
            System.out.println("The Number " + num + " is a PRIME NUMBER");
        }

        boolean primeFlag = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                primeFlag = true;
                break;
            }
        }

        if (!primeFlag) {
            System.out.println("The Number " + num + " is a PRIME NUMBER");
        } else {
            System.out.println("The Number " + num + " is NOT a PRIME NUMBER");
        }
    }
}
