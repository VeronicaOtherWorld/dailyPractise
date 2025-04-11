/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr10;

/**
 *
 * @author luyi
 */
public class Quick {
    public static void quick(int[] f, int start, int end){
        if(start < end){
            int index = parition(f, start, end);
            quick(f, start, index -1);
            quick(f, index+1 , end);
        }
    }
    
    
    public static int parition(int[] f, int start, int end){
        int pivot = f[end];
        int index = start;
        for (int i = start; i < end; i++) {
            if(f[i]<=pivot){
                int temp = f[i];
                f[i] = f[index];
                f[index] = temp;
                index++;
            }
        }
        int temp = f[end];
        f[end] = f[index];
        f[index] = temp;
        return index;
    }
}
