package com.company.logic03;

import java.util.Scanner;

public class Modus {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan n =");
        int n = input.nextInt();
        int[] arrayA = new int[n];
        int[] arrayB = new int[n];


        System.out.println("Masukkan angka yang akan di proses: ");
        for (int i = 0; i < n ; i++) {
            arrayA[i] = input.nextInt();
        }
        int count;
        for (int i = 0; i < n; i++) {
            count =1;
            if (arrayA[i]==-1){
                arrayB[i]=0;
            }
            else {
                for (int j = i+1; j < n; j++) {
                    if (arrayA[i] == arrayA[j]){
                        count ++;
                        arrayA[j] = -1;
                    }
                }
                arrayB[i] = count;
            }
        }
        int modus = arrayB[0];
        for (int i = 1; i < n; i++) {
            if (arrayB[i] >= modus){
                modus = arrayB[i];
            }
        }
        System.out.print("Modusnya : ");
        for (int i = 0; i < n; i++) {
            if (arrayB[i] == modus){
                System.out.print(arrayA[i]+" ");
            }
        }
    }
}
