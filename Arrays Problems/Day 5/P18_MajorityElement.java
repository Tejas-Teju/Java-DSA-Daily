package Day_5;

import java.util.Scanner;

public class P18_MajorityElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(majorityElement(arr));
    }

    private static int majorityElement(int []arr) {
        int n = arr.length, count = 1;

        for (int i=0; i<n; i++) {
            count = 1;
            for (int j=i+1; j<n; j++) {
                if(arr[i] == arr[j]) count++;
            }
            if (count > n/2) return i;
        }

        return -1;
    }
}
