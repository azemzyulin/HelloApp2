package com.company;

import java.lang.management.MemoryUsage;

//import java.util.Scanner;
public class Main {
    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        {
            for (int i = 0; i < 10; i++) {
                result[i] = new int[i + 1];
            }
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    result[i][j] = i + j;
                    if (j < result[i].length - 1) {
                        System.out.print(result[i][j] + " ");
                    } else {
                        System.out.println(result[i][j]);
                    }
                }
            }
        }
    }
}
