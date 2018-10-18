import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1, x = 0, y = 0;
        while (i != 0) {
            System.out.print("Input a number: ");
            i = Integer.valueOf(sc.nextLine());

            if (i % 2 == 0) {
                x++;
            }
            if (i % 2 != 0) {
                y++;
            }
        }
        System.out.println("\n" + "Even: " + x + "\n" + "Odd: " + y);
    }
}
