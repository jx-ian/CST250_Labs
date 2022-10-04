package lab04b;

/**
 * @author jiahaoxian
 */

public class Lab04b {

    public static void main(String[] args) {

        
        
    }
    
    public static void mySort(int [] inputArray) {
        
        int arraySize = inputArray.length;
        
        for(int i = 0; i < arraySize - 1; i++) {
            
            int index = 1;
            
            for(int j = 1; j < arraySize; j++) {
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
