package codetalksdna.CodingPrograms;

public class MergeSortAlgorithm {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;
        int mid = n / 2;

        int[] left = new int[mid];
        int[] right = new int[n - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, n - mid);
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int nLeft = left.length;
        int nRight = right.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nLeft && j < nRight) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < nLeft) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < nRight) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12, 1, 6, 4};
        System.out.println("Array before sorting:");
        printArray(arr);
        mergeSort(arr);
        System.out.println("Array after sorting:");
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
