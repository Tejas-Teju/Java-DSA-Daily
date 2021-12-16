package Day_3;

import java.util.Scanner;

public class P14_MaxConsecutiveOnes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxConsecutiveOnes(arr));
    }

    private static int maxConsecutiveOnes(int []arr) {
        int count = 0, n = arr.length, max = 0;

        for (int i=0; i<n; i++) {
            if (arr[i] == 1) {
                count++;
                if (max < count) max = count;
            } else {
                count = 0;
            }
        }

        return max;
    }
}
