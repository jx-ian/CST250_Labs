package lab04b;

/**
 * @author jiahaoxian
 */

public class Lab04b {

    public static void main(String[] args) {

        int[] array = {100, 53, 67, 24, 73, 91, 12, 83, 29, 43, 51, 67, 62, 51, 632, 532, 743, 562, 452};

        mySort(array);
        System.out.println("The sorted array: ");

        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void mySort(int[] inputArray) {

        int arraySize = inputArray.length;

        for (int i = 0; i < arraySize - 1; i++) {

            int index = i;

            for (int j = i + 1; j < arraySize; j++) {
                if (inputArray[j] < inputArray[index]) {
                    index = j;
                }
            }

            int temp = inputArray[i];
            inputArray[i] = inputArray[index];
            inputArray[index] = temp;
        }
    }
}
