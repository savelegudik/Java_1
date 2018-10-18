import java.util.Random;
import java.util.Scanner;

public class GuessYou {
    public static void main(String[] args) {
        System.out.println(cycle());
    }

    private static int cycle() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int a = r.nextInt(8);

        int b = -1;
        int i = 0;
        while (a != b) {
            System.out.print("Input a number: ");
            b = Integer.valueOf(sc.nextLine());
            if (a != b) {
                System.out.println("Incorrect");
                if (b > a) {
                    System.out.println("Smaller please");
                } else {
                    System.out.println("Bigger please");
                }
            } else {
                System.out.println("Congratulations! It's Correct!");
            }
            System.out.println();
            i++;
        }
        System.out.print("Iteration: ");
        return i;
    }
}
