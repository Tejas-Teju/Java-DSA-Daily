import java.util.Scanner;

public class P5_RemoveDuplicatesInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        removeDuplicates(arr);

        for(int i =0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void removeDuplicates(int []arr) {
        int res = 1;

        for(int i=1; i<arr.length; i++) {
            if(arr[i] != arr[res-1]) {
                arr[res] = arr[i];
                res++;
            }
        }

        for(int i=res; i<arr.length; i++) {
            arr[i] = 0;
        }
    }
}
