import java.util.Scanner;

public class P2_SecondLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(secondLargest(arr));
    }

    private static int secondLargest(int []arr) {
        int index = -1;
        int largest = arr[0];
        int secondLargest = -1;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
                index = i;
            }
        }

        return index;
    }
}
