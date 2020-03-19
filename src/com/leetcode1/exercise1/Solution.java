package com.leetcode1.exercise1;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextByte();
        int contador = 0;
        for (int i = num; i >= 0; i--) {

            if (num % 2 == 0 && num > 0) {
                num = num / 2;
                contador++;
            } else if (num > 0) {
                num--;
                contador++;
            }
        }
        System.out.println(contador);
    }
}

