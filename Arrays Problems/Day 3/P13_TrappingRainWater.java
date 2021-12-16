package Day_3;

import javax.swing.plaf.metal.MetalTheme;
import java.util.Scanner;

public class P13_TrappingRainWater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(trappingRainWater(arr));
    }

    private static int trappingRainWater(int []arr) {
        int n = arr.length, res = 0;;
        int []lmax = new int[n];
        int []rmax = new int[n];

        // θ(n) time
        lmax[0] = arr[0];
        for (int i=1; i<n-1; i++) {
            lmax[i] = Math.max(arr[i], lmax[i-1]);
        }

        rmax[n-1] = arr[n-1];
        for (int i=n-2; i>=0; i--) {
            rmax[i] = Math.max(arr[i], rmax[i+1]);
        }

        for (int i=1; i<n-1; i++) {
            res += Math.min(lmax[i], rmax[i]-arr[i]);
        }

        return res;
    }
}
