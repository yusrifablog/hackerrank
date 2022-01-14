package com.company.logic03;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Simplearraysum {

    public static void Resolve() {
        Scanner input = new Scanner(System.in);


        System.out.print(" Masukkan Nilai n: ");
        int n = input.nextInt();
        int[] arrayInt = new int[n];

        int sum = 0;
        System.out.println("Masukkan Angka Yang Akan dijumlahkan: ");
        for (int i = 0; i < n; i++) {
            arrayInt[i] = input.nextInt();
            sum += arrayInt[i];
        }
        System.out.println("Hasil Penjumlahan :" + sum);

    }
}
