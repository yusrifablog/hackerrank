package com.company.logic03;

import java.util.Scanner;

public class StairCase {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        System.out.print(" Enter the Value of n: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            //jumlah tinggi Segitiga
            for (int j = (n-1); j >= i; j--) {
                // spasi per baris
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
