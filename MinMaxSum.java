package com.company.logic03;

import java.util.Scanner;

public class MinMaxSum {
    public static void Resolve () {
        Scanner input = new Scanner(System.in);

        System.out.print("input n: ");
        int n = input.nextInt();
        int[] array = new int[n];

        //Untuk Inputan Angka yang akan dijumlahkan
        int angka = 0;
        System.out.println("Masukkan Angka : ");
        //looping aray untuk menambahkan dimasukan ke array
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
            angka += array[i];

        }

        //Untuk Mengitung minimal dan maksimal
        long sum =0; //Long  tipe data 64bit
        int minimal = array[0]; //untuk tampungan minimal
        int maksimal = array[0]; // untuk tampungan maksimal
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            if (array[i]<minimal){
                minimal = array[i];
            }
            else if (array[i]>maksimal){
                maksimal = array[i];
            }
        }
        System.out.println((sum-maksimal)+" "+(sum-minimal));
    }
}
