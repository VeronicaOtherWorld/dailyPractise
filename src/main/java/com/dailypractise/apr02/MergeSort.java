/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr02;

/**
 *
 * @author luyi
 */
public class MergeSort {
    public static void mergeSort(int[] a, int l, int u){
        if(l + 1 < u){
            int mid = l + (u - l) /2;
            mergeSort(a, l, mid);
            mergeSort(a, mid, u);
            merge(a, l, mid, u);
        }
    }
    
    public static void merge(int[] a, int l ,int mid, int u){
        
        int i = l;
        int j = mid;
        int t = 0;
        int[] temp = new int[u - l];
        while(i < mid && j < u){
            if(a[i]<a[j]){
                temp[t] = a[i];
                t++;
                i++;
            } else {
                temp[t] = a[j];
                j++;
                t++;
            }
        }
        while(i < mid){
            temp[t] = a[i];
            t++;
            i++;
        }
        while(j < u){
            temp[t] = a[j];
            t++;
            j++;
        }
        
        // copy back to the array
       i = l;
       t = 0;
        while(t < temp.length){
            a[i] = temp[t];
            i++;
            t++;
        }
    }
}
