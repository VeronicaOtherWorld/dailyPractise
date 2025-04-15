/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr15;

/**
 *
 * @author luyi
 */
public class Selection {
    public static void selection(int[] f){
        for (int i = 0; i < f.length; i++) {
            int small = i;
            for (int j = i +1; j < f.length; j++) {
                if(f[small] > f[j]){                    
                    small  = j;
                }
            }
            int temp = f[small];
            f[small] = f[i];
            f[i] = temp;
        }
    }
}
