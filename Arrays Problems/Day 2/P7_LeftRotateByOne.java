package Day_2;

import java.util.Scanner;

public class P7_LeftRotateByOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        leftRotateByOne(arr);

        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void leftRotateByOne(int []arr) {
        int temp = arr[0];
        int i;

        for(i=1; i<arr.length; i++) {
            arr[i-1] = arr[i];
        }

        arr[i-1] = temp;
    }
}
