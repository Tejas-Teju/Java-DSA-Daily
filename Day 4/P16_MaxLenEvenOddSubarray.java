package Day_4;

import java.util.Scanner;

public class P16_MaxLenEvenOddSubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxLenEvenOddSubarray(arr));
    }

    private static int maxLenEvenOddSubarray(int []arr) {
        int n = arr.length, res = 1, count = 1;

        // Naive solution having O(n^2) time complexity
        /*int res = 0, count = 0;
        for (int i=0; i<n; i++) {
            count = 1;
            for (int j=i+1; j<n; j++) {
                if ((arr[j-1]%2 == 0 && arr[j]%2 != 0)
                        || (arr[j-1]%2 != 0 && arr[j]%2 == 0)) count++;
                else break;
            }

            res = Math.max(res, count);
        }*/

        for (int i=1; i<n; i++) {
            if ((arr[i-1]%2 == 0 && arr[i]%2 != 0)
                    || (arr[i-1]%2 != 0 && arr[i]%2 == 0)) {
                count++;
                res = Math.max(res, count);
            } else {
                count = 1;
            }
        }

        return res;
    }
}
