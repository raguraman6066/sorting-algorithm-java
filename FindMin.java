public class FindMin {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6 };
        int min_index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[min_index] > arr[i]) {
                min_index = i;
            }
        }
        System.out.println(min_index);
    }
}