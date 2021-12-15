package Day_2;

import java.util.Scanner;

public class P12_StockBuyAndSell {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(stockBuyAndSell(arr));
    }

    private static int stockBuyAndSell(int []arr) {
        int profit = 0, n = arr.length;

        /*int  buy = 0;
        String type = "BUY", status = "UNSOLD";

        for (int i=0; i<n-1; i++) {
            if (arr[i] < arr[i+1] && type.equals("BUY")) {
                buy = arr[i];
                type = "SELL";
                status = "UNSOLD";
            }

            if (arr[i] > arr[i+1] && type.equals("SELL")) {
                profit += arr[i] - buy;
                type = "BUY";
                status = "SOLD";
            }
        }

        if (status.equals("UNSOLD") && type.equals("SELL")) {
            profit += arr[n-1] - buy;
        }*/

        //Better approach - theta(n) time and theta(1) space
        for (int i=1; i<n; i++) {
            if(arr[i] > arr[i-1]) {
                profit += (arr[i] - arr[i-1]);
            }
        }

        return profit;
    }
}
