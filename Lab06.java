package lab06;

/**
 * @author jiahaoxian
 */

public class Lab06 {

    public static void main(String[] args) {
        
        int [] arr = {10, 20, 30, 40, 50};          //The array
        int key = 30;           //The target number
        
        int last = arr.length-1;        //Finding the last index in the 
        
        binarySearch(arr, 0, last, key);            //Branching to "binarySearch" with variables in the main class
        
    }
    
    public static void binarySearch(int[] arr, int first, int last, int key) {          //Receiving variables from the main method
        
        int mid = (first + last) / 2;           //Finding middle by adding first and last index then divide by 2
        
        while (first <= last) {         //While loop whenever last index is greater than or equal to the first then
            if (arr[mid] < key) {           //If middle in the array is smaller than the target then
                first = mid + 1;            //middle turns to next index when the target is bigger than the middle
            }
            else if (arr[mid] == key) {         //If middle is the target then
                System.out.println("Element is found at index: " + mid);            //Print target is found with the index that it's at
                break;          //Terminates the loop
            }
            else {          //Anything else doesn't qualify for the if statements
                last = mid - 1;         //middle turns to previous index when target is smaller than the middle
            }
            mid = (first + last) / 2;           //Finding middle from the new first and last index
        }
            
            if (first > last) {         //Whenever first index gets bigger than the last index then
                System.out.println("Element is not found!");            //Print not found
        }
    }
}
