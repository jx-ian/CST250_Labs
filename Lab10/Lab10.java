
package lab10;

/**
 * @author jiahaoxian
 */

public class Lab10 {

    public static void main(String[] args) {

        Node root = new Node(20);
        root.left = new Node(15);
        root.right = new Node(30);
        root.left.left = new Node(10);
        root.left.left.right = new Node(12);
        root.left.right = new Node(15);
        root.left.left.left = new Node (18);

        
    }
}
