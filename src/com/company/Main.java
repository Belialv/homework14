package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] x = new int[4];
        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(r.readLine());
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        for (int i = 0; i < 4; i++) {
            if (x[i] < x[i + 1]) {
                i++;
            } else {
                System.out.println("Не является строго возрастающей");
                break;
            }
            if (x[i] == x[3] ){
                System.out.println("Является строго возрастающей!");
            }
        }
    }
}
