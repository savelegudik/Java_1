public class IfElse {
    public static void main(String[] args) {
        int x = 5, y = 6, z = 7;
        if (x > y) {
            System.out.println("x > y = " + x);
            if (x > z) {
                System.out.println("x > z");
            } else {
                System.out.println("z > x");
            }
        } else {
            System.out.println("y > x = " + y);
            if (y > z) {
                System.out.println("y > z");
            } else {
                System.out.println("z > y and x");
            }
        }
    }
}
