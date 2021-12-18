package Day_5;

import java.util.Scanner;

public class P19_MinGroupFlips {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        minGroupFlips(arr);
    }

    private static void minGroupFlips(int []arr) {
        int n = arr.length, secondGroup;
        boolean flag = false;

        if(arr[0] == arr[n-1] && arr[0] != 1) { // this tells us what must be 2nd group
                secondGroup = 1;
        } else {
            if (arr[0] == 1) secondGroup = 0;
            else secondGroup = 1;
        }

        for (int i=0; i<n; i++) {
            if (arr[i] == secondGroup && !flag) {
                flag = true;
                System.out.print("From "+ i +" to ");
                if (i==n-1) System.out.println(i); // to print the last ele index eg {0,0,1,1,0,0,1,1,0,1}
            }
            if (arr[i] != secondGroup && flag) {
                flag = false;
                System.out.println(i-1);
            }
        }
    }
}
