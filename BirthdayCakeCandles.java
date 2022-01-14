package com.company.logic03;

import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan n =");
        int n = input.nextInt();

        int maksimal =0;
        int jumlah =0;
        int angka;

        System.out.println("Masukkan angka yang akan di proses: ");
        for (int i = 0; i < n; i++) {
            angka =input.nextInt();
            if (angka > maksimal){
                jumlah =1;
                maksimal=angka;
            }
            else if (angka == maksimal){
                jumlah++;
            }
        }
        System.out.println(jumlah);

    }
}
