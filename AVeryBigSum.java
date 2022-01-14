package com.company.logic03;

import java.util.Scanner;

public class AVeryBigSum {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan n =");
        int n = input.nextInt();
        int[] arrayInt = new int[n];

        //int maksimal =0;
        long jumlah =0; //make long karena 32 bit

        System.out.println("Masukkan angka yang akan di proses: ");
        for (int i = 0; i < n; i++) {
            arrayInt[i] = input.nextInt();
            jumlah += arrayInt[i];
        }
        System.out.println("Hasil Penjumlahan 32 bit :"+jumlah);
    }
}
