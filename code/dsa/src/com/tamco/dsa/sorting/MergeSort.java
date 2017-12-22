package com.tamco.dsa.sorting;

public class MergeSort {

    public static void main(String[] args) {

    }

    public static void merge(SortableItem[] items, int low, int mid, int high) {

        SortableItem[] auxiliary = new SortableItem[high - low + 1];
        for (int i = low; i <= high; i++) {
            auxiliary[i - low] = items[i];
        }

        int i = 0, j = mid - low + 1;
        while (i < mid - low + 1 && j < high - low + 1) {
            while (auxiliary[i].lessThan(auxiliary[j])) {
                items[i + low] = auxiliary[i];
                i++;
            }

//            while ()
        }
    }
}
