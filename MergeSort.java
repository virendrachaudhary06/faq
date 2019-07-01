public class MergeSort {


    public void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int mid = arr.length / 2;
        int[] first = new int[mid];
        int[] second = new int[arr.length - mid];
        for (int i = 0; i < first.length; i++) {
            first[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            second[i - mid] = arr[i];
        }

        mergeSort(first);
        mergeSort(second);
        merge(first, second, arr);
    }

    private void merge(int[] first, int[] second, int[] result) {
        int iFirst = 0;
        int iSecond = 0;
        int iResult = 0;

        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] <= second[iSecond]) {
                result[iResult++] = first[iFirst++];
            } else {
                result[iResult++] = second[iSecond++];

            }
        }

        while (iFirst < first.length) {
            result[iResult++] = first[iFirst++];
        }

        while (iSecond < second.length) {
            result[iResult++] = second[iSecond++];
        }
    }
}
