/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.mar28;

/**
 *
 * @author luyi
 */
public class Merge {
    public static void mergeSort(int[]f, int low, int upper){
        if(low +1 < upper){
            int mid = (low+upper) /2;
            mergeSort(f, low, mid);
            mergeSort(f, mid, upper);
            merge(f, low, mid, upper);
        }
    }
    public static void merge(int[]f, int low, int mid, int upper){
        int i = low;
        int j = mid;
        // create temp array
        int[] temp = new int[upper - low];
        int t = 0;
        while(i < mid && j < upper){
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
        while(i < mid){
            temp[t] = f[i];
            i++;
            t++;
        }
        
        while(j < upper){
            temp[t] = f[j];
            j++;
            t++;
        }
        // copy back to f
        i = low;
        t = 0;
        while(t < temp.length){
            f[i] = temp[t];
            i++;
            t++;
        }
    }
}
