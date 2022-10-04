package lab04a;

/**
 * @author jiahaoxian
 */

public class Lab04a {

    public static void main(String[] args) {
        
                //index   0  1   2  3  4  5  6  7  8   
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 8;
        
        System.out.println("The index for number " + n +" is "+ mySearch(array, n) + ".");
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
