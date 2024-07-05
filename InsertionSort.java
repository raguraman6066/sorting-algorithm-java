public class InsertionSort {
    public static void main(String[] args) {
        int[] myArray = { 64, 34, 25, 12, 22, 11, 90, 5 };

        for (int i = 1; i < myArray.length; i++) {
            int currentValue = myArray[i];
            int j = i - 1;
            while (j >= 0 && myArray[j] > currentValue) {
                myArray[j + 1] = myArray[j];
                j--;
            }
            myArray[j + 1] = currentValue;

        }
        System.out.print("Sorted array: ");
        for (int value : myArray) {
            System.out.print(value + " ");
        }
    }
}
