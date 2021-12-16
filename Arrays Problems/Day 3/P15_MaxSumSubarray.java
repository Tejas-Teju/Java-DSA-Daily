package Day_3;

import java.util.Scanner;

public class P15_MaxSumSubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxSumSubarray(arr));
    }

    private static int maxSumSubarray(int []arr) {
        int n = arr.length, res = arr[0], maxEnd = arr[0];

        //O(n^2) time
        /*for (int i=0; i<n; i++) {
            int sum = 0;
            for (int j=i; j<n; j++) {
                sum += arr[j];
                res = Math.max(res, sum);
            }
        }*/

        //O(n) time
        for (int i=1; i<n; i++) {
            maxEnd = Math.max(arr[i], arr[i]+maxEnd);
            res = Math.max(res, maxEnd);
        }

        return res;
    }
}
