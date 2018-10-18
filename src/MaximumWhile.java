import java.util.Scanner;

public class MaximumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 1, m = 0;
        while (n != 0) {
            System.out.println("Input a number");
            n = Integer.valueOf(sc.nextLine());
            if (n > m) {
                m = n;
            }
        }
        System.out.println(m);
    }
}
