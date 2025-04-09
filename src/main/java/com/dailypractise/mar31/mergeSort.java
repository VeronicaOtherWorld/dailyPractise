/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.mar31;

/**
 *
 * @author luyi
 */
public class mergeSort {

    public static void mergeSort(int[] f, int l, int u) {
        if (l + 1 < u) {
            int mid = (l + u) / 2;
            mergeSort(f, l, mid);
            mergeSort(f, mid, u);
            merge(f, l, mid, u);
        }
    }

    public static void merge(int[] f, int l, int mid, int u) {
        int i = l;
        int j = mid;
        int[] temp = new int[u - l];
        int t = 0;
        while (i < mid && j < u) {
            if (f[i] <= f[j]) {
                temp[t] = f[i];
                t++;
                i++;
            } else {
                temp[t] = f[j];
                j++;
                t++;
            }
        }
        //add left leave to the temp
        while (i < mid) {
            temp[t] = f[i];
            t++;
            i++;
        }
        while (j < u) {
            temp[t] = f[j];
            t++;
            j++;
        }
        // copy back to f
        
        i = l;
        t = 0;
        while(t < temp.length){
            f[i] = temp[t];
            i++;
            t++;
        }
    }
}
