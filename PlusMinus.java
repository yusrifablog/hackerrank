package com.company.logic03;

import java.util.Scanner;

public class PlusMinus {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        System.out.print("input n: ");
        int n = input.nextInt();
        int[] array = new int[n];

        //Untuk Inputan Angka yang akan dijumlahkan
        int positif = 0;
        int negatif =0;
        int nol = 0;

        System.out.println("Masukkan Angka : ");
        //looping aray untuk menambahkan dimasukan ke array
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
            if (array[i] <0){
                negatif++;
            }
            else if (array[i]>0){
                positif++;
            }
            else if (array[i] ==0){
                nol++;
            }
        }
        double tempPositif ;
        double tempNegatif ;
        double tempNol ;

        tempPositif = (double) positif/n;
        tempNegatif = (double) negatif/n;
        tempNol = (double)  nol/n;

        System.out.println("Persentase Angka yang Positif :" + String.format("%.6f", tempPositif));
        System.out.println("Persentase Angka yang Negatif :"+ String.format("%.6f",  tempNegatif));
        System.out.println("Persentase Angka yang Nol : " + String.format("%.6f", tempNol));
    }
}
