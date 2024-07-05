public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 1, 7, 9, 3 };
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
