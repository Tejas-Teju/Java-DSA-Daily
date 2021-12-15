package Day_2;

import java.util.Scanner;

public class P9_LeadersInAnArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        leadersInAnArray(arr);
    }

    private static void leadersInAnArray(int []arr) {
        int n = arr.length;
        boolean flag = false;

        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i] > arr[j]) flag = true;
                else {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.print(arr[i] + " ");
            flag = false;
        }

        System.out.print(arr[n-1] + " ");
    }
}
