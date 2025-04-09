/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.mar30;

/**
 *
 * @author luyi
 */
public class mergeSort {
    public static void mergeSort(int[] f, int l, int u ){
        if(l + 1 < u){
            int mid = (l + u) / 2;
            mergeSort(f, l, mid);
            mergeSort(f, mid, u);
            merge(f, l, mid, u);
        }
    }
    
    public static void merge(int[] f, int l ,int mid, int u){
        // assign value to i and j
        int i = l;
        int j = mid;
        //create temp[]
        int[] temp = new int[u - l];
        int t = 0;
        // when the value in the valid area
        while(i < mid && j < u){
            if(f[i] <= f[j]){
                temp[t] = f[i];
                i++;
                t++;
            } else {
                temp[t] = f[j];
                j++;
                t++;
            }
        }
        
        // add the left side to the temp[]
        while(i < mid){
            temp[t] = f[i];
            i++;
            t++;
        }
        
        while(j < u){
            temp[t] = f[j];
            j++;
            t++;
        }
        
        // copy back to f from temp
        i = l;
        t = 0;
        // the determine statement is t < temp.length
        while(t < temp.length){
           f[i] = temp[t];
           i++;
           t++;
        }
    }
}
