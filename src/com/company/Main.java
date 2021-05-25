package com.company;

import java.lang.management.MemoryUsage;

//import java.util.Scanner;
public class Main {
    public static int[][] MULTIPLICATION_TABLE;
    public static void main(String[] args) {
        {
            MULTIPLICATION_TABLE = new int[10][10];
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    MULTIPLICATION_TABLE[i][j] = (i + 1) * (j + 1);
                    if (j < 9) {
                        System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
                    } else {
                        System.out.println(MULTIPLICATION_TABLE[i][j]);
                    }
                }
            }
        }
    }
}
