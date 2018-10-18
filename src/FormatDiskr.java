import java.util.Scanner;

public class FormatDiskr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = Integer.valueOf(sc.nextLine());
        System.out.print("Input b number: ");
        int b = Integer.valueOf(sc.nextLine());
        System.out.print("Input c number: ");
        int c = Integer.valueOf(sc.nextLine());
        System.out.println();

        int diskr = discriminant(a, b, c);
        roots(a, b, diskr);

        sc.close();
    }

    private static int discriminant(int a, int b, int c) {
        int diskr = ((b * b) - 4 * a * c);
        System.out.println("D = " + diskr);
        return diskr;
    }

    private static void roots(int a, int b, int diskr) {
        double x1, x2;
        if (a != 0) {
            if (diskr > 0) {
                x1 = ((-b + Math.sqrt(diskr)) / 2 * a);
                x2 = ((-b - Math.sqrt(diskr)) / 2 * a);
                String fD1 = String.format("%.2f", x1);
                String fD2 = String.format("%.2f", x2);
                System.out.println("x1 = " + fD1);
                System.out.println("x2 = " + fD2);
            } else if (diskr == 0) {
                x1 = ((-b + Math.sqrt(diskr)) / 2 * a);
                String fD1 = String.format("%.2f", x1);
                System.out.println("x = " + fD1);
            } else {
                System.out.println("Error: D < 0");
            }
        } else {
            System.out.println("Error: a = 0");
        }
    }
}
