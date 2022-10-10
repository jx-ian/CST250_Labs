package lab05;

/**
 * @author jiahaoxian
 */

public class Lab05 {

    public static void main(String[] args) {
        
        //Compilation Errors (Syntax Errors)
        int a = 5, b = 6;
        
        int Sum = a + b;
        
        //System.out.println("The sum of variables is " + sum); -- variable "sum" is not same with "Sum" 
        System.out.println("The sum of variables is " + Sum);
        
        
        //Run-time Errors
        int arr[] = new int[5];
        
        //arr[9] = 250; -- no such index 9; only 0 - 4
        arr[4] = 250;
        
        System.out.println("Value assigned! " + arr[4]);
        
        
        //Logical Errors
        int c = 2, d = 8, e = 6; // a & b was used.
        
        System.out.println("Finding the largest number");
        
        if (c > d && c > e)
            System.out.println(c + " is the largest number");
        else if (d > c && d > e)
            //System.out.println(d + " is the smallest number"); -- largest not smallest
            System.out.println(d + " is the largest number");
        else
            System.out.println(e + "is the largest number");
        
    }
}