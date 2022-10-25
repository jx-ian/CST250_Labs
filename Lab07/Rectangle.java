package lab07;

/**
 * @author jiahaoxian
 */
public class Rectangle {

    int width;
    int height;
    boolean filled;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void Draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void Draw2() {
        if (filled == false) {
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= width; j++) {
                    if (i == 1 || j == 1 || i == height || j == width) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
