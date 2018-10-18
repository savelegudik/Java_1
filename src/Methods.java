import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = Integer.valueOf(sc.nextLine());
        System.out.print("Input second number: ");
        int b = Integer.valueOf(sc.nextLine());
        System.out.println(cycle(a, b));
        sc.close();
    }

    private static int cycle(int a, int b) {
        while (a < b) {
            System.out.println(a);
            a = a + 1;
        }
        return a;
    }
}
