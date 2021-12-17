package Day_4;

import java.util.Scanner;

public class P17_MaxCircularSubarraySum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxCircularSubarraySum(arr));
    }

    public static int maxCircularSubarraySum(int []arr) {
        int n = arr.length, sum = 0;

        //O(n^2) time
        /*for (int i=0; i<n; i++) {
            sum = arr[i];
            for (int j=1; j<n; j++) {
                int index = (i+j)%n;
                sum += arr[index];
                res = Math.max(res, sum);
            }
        }*/

        int maxNormal = kadaneForNormalArray(arr);

        if (maxNormal < 0) return maxNormal;

        for (int i=0; i<n; i++) {
            sum += arr[i];
            arr[i] = -arr[i];
        }

        int circularMax = sum + kadaneForNormalArray(arr);

        return Math.max(maxNormal, circularMax);
    }

    private static int kadaneForNormalArray(int []arr) {
        int n = arr.length, maxEnd = arr[0], res = arr[0];

        for (int i=1; i<n; i++) {
            maxEnd = Math.max(arr[i], maxEnd + arr[i]);
            res = Math.max(res, maxEnd);
        }

        return res;
    }
}
