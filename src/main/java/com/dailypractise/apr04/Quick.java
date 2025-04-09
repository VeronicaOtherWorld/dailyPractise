/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr04;

/**
 *
 * @author luyi
 */
public class Quick {
    public static void quick(int[] f, int start, int end){
        if(start < end){
            int index = p(f, start, end);
            quick(f, start, index -1);
            quick(f, index +1, end);
        }
    }
    
    public static int p(int[] f, int start, int end){
        int pivot = f[end];
        int k  = start;
        for (int j = start; j < end; j++) {
            if(f[j]<= pivot){
                int temp = f[k];
                f[k] = f[j];
                f[j] = temp;
                k++;
            }
        }
        int temp = f[k];
        f[k] = f[end];
        f[end] = temp;
        return k;
    }
}
