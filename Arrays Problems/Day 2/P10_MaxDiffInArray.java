package Day_2;

import java.util.Scanner;

public class P10_MaxDiffInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxDiffInArray(arr));
    }

    private static int maxDiffInArray(int []arr) {
        int n = arr.length;

        // brute force - theta(n^2) time and theta(1)
        /*
        int max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if(arr[j]-arr[i] > max) {
                    max = arr[j]-arr[i];
                }
            }
        }
        return max;
        */

        /* - assume there are min of two elements in an array
           - Complexity: theta(n) time and theta(1) space
           Method:
           Step 1: Assume result = difference b/n 1st two elements
                   and minVal = 1st ele of the array
           Step 2: loop through array from 1st ele
                   Compute res = MAX (res, curr_ele-minVal)
                   Compute minVal = MIN (minVal, curr_ele)
        */
        int res = arr[1]-arr[0];
        int min = arr[0];

        for (int i=1; i<n; i++) {
            res = Math.max(res, arr[i]-min);
            min = Math.min(min, arr[i]);
        }

        return res;
    }
}
