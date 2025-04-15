/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr15;

/**
 *
 * @author luyi
 */
public class Instertion {
    public static void insertion(int[] f){
        int s = 1;
        while(s < f.length){
            int c = s;
            while(c > 0 && f[c] < f[c -1]){
                int temp = f[c];
                f[c] = f[c -1];
                f[c -1] = temp;
                c--;
            }
            s++;
        }
    }
}
