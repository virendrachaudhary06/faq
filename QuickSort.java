public class QuickSort {
    int[] arr;

    public void sort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        this.arr = arr;
        quickSort(0, arr.length - 1);
        System.out.println(arr.toString());
    }

    private void quickSort(int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low + (high - low) / 2];
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while ((arr[j] > pivot)) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(low, j);
        }
        if (i < high) {
            quickSort(i, high);
        }

    }

    private void swap(int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

}
