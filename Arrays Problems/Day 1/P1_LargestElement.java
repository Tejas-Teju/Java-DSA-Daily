import java.util.Scanner;

public class P1_LargestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(getLargest(arr));
    }

    private static int getLargest(int []arr) {
        int largest = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i] > largest) largest = arr[i];
        }

        return largest;
    }
}
