package Task2.x;

import java.util.Arrays;

public class Task2_1 {
    public static void mergeSort(int[] array) {
        helper(array, 0, array.length - 1);
    }

    public static void helper(int array[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            helper(array, left, mid);
            helper(array, mid + 1, right);
            mergeTwoArray(array, left, mid, right);
        }
    }

    public static void mergeTwoArray(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int p1 = 0, p2 = 0, p3 = left;
        while (p1 < n1 && p2 < n2) {
            if (leftArray[p1] <= rightArray[p2]) {
                arr[p3] = leftArray[p1];
                p1++;
            } else {
                arr[p3] = rightArray[p2];
                p2++;
            }
            p3++;
        }

        while (p1 < n1) {
            arr[p3] = leftArray[p1];
            p1++;
            p3++;
        }

        while (p2 < n2) {
            arr[p3] = rightArray[p2];
            p2++;
            p3++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 9, 4, 0, 5, 7 };
        mergeSort(arr);

        // In mảng đã sắp xếp
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}