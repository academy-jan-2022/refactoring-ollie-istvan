package com.sorter;

public class QuickSort extends Sort {

    public int[] sort(int[] input) {

        return quicksort(input, 0, input.length-1);
    }

    private int partition(int[] input, int left, int right) {
        int i = left, j = right;
        int pivot = input[(left + right) / 2];
        i = pivotElements(input, i, j, pivot);
        return i;
    }

    private int pivotElements(int[] input, int i, int j, int pivot) {
        while (i <= j) {
            while (input[i] < pivot)
                i++;
            while (input[j] > pivot)
                j--;
            if (i <= j) {
                swap(input, i, j);
                i++;
                j--;
            }
        }
        return i;
    }
    private int[] quicksort(int[] input, int left, int right) {
        int index = partition(input, left, right);
        sortLeft(input, left, index);
        sortRight(input, right, index);
        return input;
    }

    private void sortRight(int[] input, int right, int index) {
        if (index < right) {
            quicksort(input, index, right);
        }
    }

    private void sortLeft(int[] input, int left, int index) {
        if (left < index - 1) {
            quicksort(input, left, index -1);
        }
    }

}
