package com.tamco.dsa.searching;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("10 in array == " + search(10, arr, 0, 9));
        System.out.println("0  in array == " + search(0, arr, 0, 9));
        System.out.println("1  in array == " + search(1, arr, 0, 9));
        System.out.println("2  in array == " + search(2, arr, 0, 9));
        System.out.println("3  in array == " + search(3, arr, 0, 9));
        System.out.println("4  in array == " + search(4, arr, 0, 9));
        System.out.println("5  in array == " + search(5, arr, 0, 9));
        System.out.println("6  in array == " + search(6, arr, 0, 9));
        System.out.println("7  in array == " + search(7, arr, 0, 9));
        System.out.println("8  in array == " + search(8, arr, 0, 9));
        System.out.println("9  in array == " + search(9, arr, 0, 9));
    }

    public static boolean search(int a, int[] arr, int low, int high) {
        if (low == high) {
            return a == arr[low];
        }

        int mid = low + ((high - low) / 2);
        if (a == arr[mid]) {
            return true;
        } else if (a < arr[mid]) {
            return search(a, arr, low, mid);
        } else {
            return search(a, arr, mid + 1, high);
        }
    }
}
