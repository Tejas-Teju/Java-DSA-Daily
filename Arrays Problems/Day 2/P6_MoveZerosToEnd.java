package Day_2;

import java.util.Scanner;

public class P6_MoveZerosToEnd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int []temp = moveZerosToEnd(arr);

        for(int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");;
        }
    }

    private static int[] moveZerosToEnd(int []arr) {

        // O(n) time and O(n) space
        /*int []temp = new int[arr.length];
        int res = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                temp[res] = arr[i];
                res++;
            }
        }

        return temp;
        */

        //O(n) time and O(1) space
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                //swap arr[i] and arr[count]
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;
            }
        }

        return arr;
    }
}
