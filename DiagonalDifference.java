package com.company.logic03;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the Value of n: ");
        int n = input.nextInt();
        int diagonal1 = 0,diagonal2 = 0;
        int sum = 0;
        int[][] array = new int[3][n];

        //untuk inputan dan diagonal 1 yang begini \
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                array [i][j] = input.nextInt();
                if (i==j){
                    diagonal1 += array[i][j];
                }
            }
        }
        //untuk mencari diagonal /
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (i+j == n-1 ){
                    diagonal2 += array[i][j];
                }
            }
        }
        System.out.println(Math.abs(diagonal1-diagonal2));
    }
}
