package com.company.logic03;

import java.util.Scanner;

public class KaosKaki {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);
        System.out.print(" Masukkan Nilai n: ");
        int n = input.nextInt();
        int[] arrayInt = new int[n];

        int nambah = 0;
        int kaoskaki =0;
        System.out.print("Input angka kaos kaki :" );
        //untuk input nilai ke arraynya
        for (int i = 0; i < n; i++) {
            arrayInt[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            nambah =1;
            for (int j = i+1; j < n; j++) {
                if (arrayInt[i] == arrayInt[j]){
                    nambah ++;
                }
            }
//            System.out.print("pasangannya :" +nambah);
            if (nambah % 2 ==0){
                kaoskaki++;
            }
        }
        System.out.print("jumlah pasang kaos kaki adalah :" +kaoskaki);
    }
}
