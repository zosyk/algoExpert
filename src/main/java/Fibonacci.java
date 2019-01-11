public class Fibonacci {
    public static int getNthFib(int n) {
        if(n == 1) return 0;

        int[] arr = new int[2];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i< n; i++) {
            int tmp = arr[1];
            arr[1] = arr[0] + tmp;
            arr[0] = tmp;
        }
        return arr[1];
    }
}
