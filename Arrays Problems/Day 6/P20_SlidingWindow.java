package Day_6;

import java.util.Scanner;

public class P20_SlidingWindow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // use only for maxSumOfWindow()
        /*System.out.println("Window size: ");
        int k = sc.nextInt();
        System.out.println(maxSumOfWindow(arr, k));
        */

        System.out.println("Enter sum: ");
        int sum = sc.nextInt();

        System.out.println(subArrayWithGivenSum(arr, sum));
    }

    private static int maxSumOfWindow(int []arr, int k) {
        int n = arr.length, max = Integer.MIN_VALUE;

        //Naive: O(n-k)*k time
        /*for (int i=0; i+k-1<n; i++) {
            int sum = 0;
            for (int j=0; j<k; j++) {
                sum += arr[i+j];
            }
            if (max < sum) max = sum;
        }*/

        //using sliding technique with O(n) time
        int sum = 0;
        for (int i=0; i<k; i++) {
            sum += arr[i];
        }

        for (int i=k; i<n; i++) {
            sum = sum - arr[i-k] + arr[i];
            if (max < sum) max = sum;
        }

        return max;
    }

    // Non-negative integers only
    private static boolean subArrayWithGivenSum(int []arr, int sum) {
        boolean res = false;
        int currSum = arr[0], s=0, n = arr.length;

        //Naive O(n^2)
        /*for (int i=0; i<n; i++) {
            int CurrSum = 0;
            for (int j=i; j<n; j++) {
                CurrSum += arr[j];
                if (CurrSum == sum) return true;
            }
        }*/

        //Efficient: O(n)
        for (int e=1; e<n; e++) {
            // clean previous window
            while(currSum>sum && s<e-1) {
                currSum -= arr[s];
                s++;
            }
            if (currSum == sum) return true;
            if (e<n) currSum += arr[e];
        }
        
        return res;
    }
}
