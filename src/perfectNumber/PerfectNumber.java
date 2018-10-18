package perfectNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumber {

    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = Integer.valueOf(sc.nextLine());
        check(number);
    }

    public static int sum(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                list.add(i);
                sum = sum + i;
            }
        }
        System.out.println(number + " = " + list);
        System.out.println("Sum = " + sum);
        return sum;
    }

    public static NumberType check(int number) {
        int sum = sum(number);
        NumberType answer;
        if (number == sum) {
            answer = NumberType.PERFECT;
        } else if (number > sum) {
            answer = NumberType.DEFICIENT;
        } else {
            answer = NumberType.ABUNDANT;
        }
        return answer;
    }
}
