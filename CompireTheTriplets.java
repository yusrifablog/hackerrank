package com.company.logic03;

import java.util.Scanner;

public class CompireTheTriplets {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);
        //int n = 0;
        System.out.print("masukkan n =");
        int n = input.nextInt();

        int[] arrayA = new int[n];
        int[] arrayB = new int[n];
        int nampungA = 0, nampungB = 0 ;

        System.out.print("Masukkan angka yang akan di proses: ");
        for (int i = 0; i < n ; i++) {
            arrayA[i] = input.nextInt();
        }
        for (int i = 0; i < n ; i++) {
            arrayB[i] = input.nextInt();
        }

        for (int i = 0; i <n ; i++) {
            if (arrayA[i] > arrayB[i]){
                nampungA ++;
            }else if (arrayA[i] < arrayB[i]){
                nampungB ++;
            }
        }
        System.out.println(nampungA+" "+nampungB);
    }
}
