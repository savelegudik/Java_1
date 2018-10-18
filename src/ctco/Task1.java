package ctco;

public class Task1 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 5, 5, 5, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        int sum = 0;
        int max = 0;
        int answer = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                sum++;
            } else {
                sum = 0;
            }
            if (sum > max) {
                max = sum;
                answer = a[i];
            }
        }
        System.out.println(answer);
    }
}
