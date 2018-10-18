package ctco;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert a number for triangle's base: ");
        int n = Integer.valueOf(sc.nextLine());

        if (n % 2 == 0) {
            cycle(n, 2);
        } else {
            cycle(n, 1);
        }
    }

    private static void cycle(int n, int i2) {
        int emptyCells;
        for (int i = i2; i < n + 1; i = i + 2) {
            emptyCells = n / 2 - i / 2;
            int b = 0;
            while (b < emptyCells) {
                System.out.print(" ");
                b++;
            }
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
