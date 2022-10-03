package lab04a;

/**
 * @author jiahaoxian
 */

public class Lab04a {

    public static void main(String[] args) {

        
        
    }
    
    
    public static int mySearch(int [] inputArray, int key) {
        
        for(int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] == key) {
                return i;
            }
        }
        
        return -1;
    }
    
}
