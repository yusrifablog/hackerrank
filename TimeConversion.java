package com.company.logic03;

import java.util.Scanner;

public class TimeConversion {

    public static void Resolve() {
        System.out.println(" masukkan jam yang ingin di ubah : ");
        Scanner input = new Scanner(System.in);

        String time = input.nextLine(); //nextLine untuk inputan tipe data String
        String arrayJam[] = time.split(":");
        String jam = arrayJam[0];
        String menit = arrayJam[1];
        String detik = arrayJam[2].substring(0, 2);
        String waktu = arrayJam[2].substring(2, 4);
        if (waktu.equals("AM")) {
            if (jam.equals(12)) {
                jam = "00";
            }
            System.out.println(jam + ":" + menit + ":" + detik);
        } else {
            if (!jam.equals(12)) {
                int h = Integer.parseInt(jam);
                h = h+12;
                jam = "" + h;
            }
            System.out.println(jam + ":" + menit + ":" + detik );
        }
    }
}
