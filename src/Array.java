public class Array {
    public static void main(String[] args) {
        int[] arr = new int[6];
        int sum = 0;
        int i;
        int vid;
        for (i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * 30);
            System.out.println(i + ") arr[i] = " + arr[i]);
            sum = sum + arr[i];
            System.out.println("Sum = " + sum);
        }
        vid = sum / arr.length;
        System.out.println("Vid = " + vid);
        System.out.println();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > vid) {
                System.out.println("Answer: arr[i] > vid = " + arr[i]);
            }
        }
    }
}
