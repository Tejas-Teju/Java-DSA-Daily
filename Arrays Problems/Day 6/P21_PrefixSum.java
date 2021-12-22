package Day_6;

import java.util.Scanner;

public class P21_PrefixSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        // Use only for sumOfRange() and isEqPoint()
        /*
        int []arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }*/

        // Get sum of range
        /*System.out.println("Enter the range");
        System.out.println("Start: ");
        int start = sc.nextInt();
        System.out.println("End: ");
        int end = sc.nextInt();
        System.out.println(sumOfRange(arr, start, end));
        */

        //Equilibrium point
        //System.out.println(isEqPoint(arr));

        //Maximum appearing element in the ranges
        int []l = new int[n];
        int []r = new int[n];

        System.out.println("Enter Left ranges:");
        for (int i=0; i<n; i++) {
            l[i] = sc.nextInt();
        }
        System.out.println("Enter right ranges:");
        for (int i=0; i<n; i++) {
            r[i] = sc.nextInt();
        }
        System.out.println(maxAppearingEle(l,r));
    }

    private static int sumOfRange(int []arr, int start, int end) {
        int n = arr.length;
        int[] prefixSum = new int[n];

        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] += prefixSum[i - 1] + arr[i];
        }

        if (start != 0) {
            return prefixSum[end] - prefixSum[start - 1];
        } else {
            return prefixSum[end];
        }
    }

    private static boolean isEqPoint(int []arr) {
        int n = arr.length;

        //Brute force: O(n^2) time
        /*for (int i=0; i<n; i++) {
            int lsum = 0, rsum = 0;
            for (int j=0; j<i; j++) {
                lsum += arr[j];
            }
            for (int k=i+1; k<n; k++) {
                rsum += arr[k];
            }

            if (lsum == rsum) return true;
        }*/

        // Efficient: O(n) time and O(1) space
        int sum = 0, lsum = 0;
        for (int i=0; i<n; i++) {
            sum += arr[i];
        }

        for (int i=0; i<n; i++) {
            if (lsum == sum-arr[i]) return true;
            lsum += arr[i];
            sum -= arr[i];
        }

        return false;
    }

    private static int maxAppearingEle(int []l, int []r) {
        int []arr = new int[1000];

        for (int i=0; i<l.length; i++) {
            arr[l[i]]++;
            arr[r[i]+1]--;
        }

        int res = 0, max = arr[0];
        for (int i=1; i<1000; i++) {
            arr[i] += arr[i-1];
            if (max < arr[i]) {
                max = arr[i];
                res = i;
            }
        }
        
        return res;
    }
}
