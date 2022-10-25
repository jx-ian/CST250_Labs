
package lab07;

/**
 * @author jiahaoxian
 */

public class Lab07 {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5, 8);
        r1.Draw();
        r1.filled = false;
        r1.Draw2();
        
        Rectangle r2 = new Rectangle(8, 5);
        r2.Draw();
        r2.filled = false;
        r2.Draw2();
    }
    
}
