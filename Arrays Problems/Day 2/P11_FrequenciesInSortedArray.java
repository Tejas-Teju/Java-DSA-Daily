package Day_2;

import java.util.Scanner;

public class P11_FrequenciesInSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        frequenciesInSortedArray(arr);
    }

    // Complexity: theta(n) time and theta(1) space
    private static void frequenciesInSortedArray(int []arr) {
        int count = 1, num = arr[0], n = arr.length;

        for (int i=1; i<n; i++) {
            if (num == arr[i]) count++;
            else {
                System.out.println(num + " " + count);
                num = arr[i];
                count = 1;
            }
        }
        System.out.println(num + " " + count);
    }
}
