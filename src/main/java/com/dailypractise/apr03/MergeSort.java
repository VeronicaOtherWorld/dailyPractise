/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr03;

/**
 *
 * @author luyi
 */
public class MergeSort {
    public static void mergeSort(int[] f, int l, int u){
        if(l + 1 < u){
            int mid = l + (u - l)/2;
            mergeSort(f, l, mid);
            mergeSort(f, mid, u);
            merge(f, l, mid, u);
        }
    }
    
    public static void merge(int[] f, int l, int mid, int u){
        int i = l;
        int j = mid;
        int t = 0;
        int[] temp = new int[u -l];
        while(i < mid && j < u){
            if(f[j]>f[i]){
                temp[t] = f[i];
                i++;
                t++;
            } else{
                temp[t] = f[j];
                j++;
                t++;
            }
        }
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
        
        // copy back to array f
        i = l;
        t = 0;
        while(t < temp.length){
            f[i] = temp[t];
            i++;
            t++;
        }
    }
}
