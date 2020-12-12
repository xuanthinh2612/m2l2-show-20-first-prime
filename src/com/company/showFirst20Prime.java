package com.company;

import java.util.Scanner;

public class showFirst20Prime {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert how many Prime number you want to show");
        int num = scanner.nextInt();
        int[] arr = new showFirst20Prime().showPrime(num);
        String out = "";
        for (int i = 0; i < arr.length; i++) {
            out += arr[i]+"\t";
        }
        System.out.printf("the first %d Prime is: \n%s",num,out);
    }
    public boolean checkPrime(int n){
        if (n<2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    public int[] showPrime(int n){
        int count = 0;
        int[] arr = new int[n];
        for (int i = 1; count < n  ; i++) {
            boolean check = new showFirst20Prime().checkPrime(i);
            if (check) {
                arr[count] = i;
                count++;
            }
        }
        return arr;
    }
}
