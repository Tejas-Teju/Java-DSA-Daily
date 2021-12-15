import java.util.Scanner;

public class P4_ReverseAnArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        revArray(arr);

        for(int i =0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    private static void revArray(int []arr) {

        int temp = 0;
        int len = arr.length;

        for(int i=0; i<len/2; i++) {
            temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }

    }
}
