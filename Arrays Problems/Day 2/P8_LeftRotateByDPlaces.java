package Day_2;

import javax.print.event.PrintEvent;
import java.util.Scanner;

public class P8_LeftRotateByDPlaces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of rotations: ");
        int d = sc.nextInt();

        leftRotateByDPlaces(arr, d%arr.length); // modulo for large # of rotations

        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void leftRotateByDPlaces(int []arr, int d) {

        //Brute force theta(n*d) time and theta(1) auxiliary space
        /*while(d%arr.length > 0) {
            int temp = arr[0];
            int i;

            for (i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }

            arr[i - 1] = temp;
            d--;
        }*/

        /*
        //theta(n+d) or theta(n) time and theta(d) space
        int []temp = new int[d];

        //copy d # of values to temp arr
        for(int i=0; i<d; i++) { // time complx: theta(d)
            temp[i] = arr[i];
        }

        //shift arr.length-d # of values to left
        for(int i=0; i+d<arr.length; i++) { // time complx: theta(n-d)
            arr[i] = arr[i+d];
        }

        //copy d values from temp to arr starting from index d+1
        for(int i=d+1; i<arr.length; i++) { // time complx: theta(d)
            arr[i] = temp[i-d-1];
        }
         */

        int n = arr.length;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }

    private static void reverse(int []arr, int low, int high) {

        while(low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }
}
