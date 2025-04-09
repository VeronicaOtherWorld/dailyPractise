/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr06;

/**
 *
 * @author luyi
 */
public class Insertion {
    public static void insertion(int[] f){
        int soredindex = 1;
        while(soredindex < f.length){
            int current = soredindex;
            while(current > 0 && f[current] < f[current -1]){
                int temp = f[current];
                f[current] = f[current - 1];
                f[current -1] = temp;
                current--;
            }
            soredindex++;
        }
    }
}
