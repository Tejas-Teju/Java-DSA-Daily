import java.util.Scanner;

public class P3_ArraySorted {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(checkSorted(arr));
    }

    private static boolean checkSorted(int []arr) {

        for(int i=0; i<arr.length-1; i++) {
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
}
