/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.mar27;

/**
 *
 * @author luyi
 */
public class Merge {
    public static void mergeSort(int[] f, int lowerB, int upperB){
        if(lowerB + 1 < upperB){
            int mid = (lowerB + upperB) /2;
            mergeSort(f, lowerB, mid);
            mergeSort(f, mid, upperB);
            merge(f, lowerB, mid, upperB);
        }
    }
    public static void merge(int[]f, int lowerB, int mid, int upperB){
        int i = lowerB;
        int j = mid;
        // use temp array to store merged sub-sequence
        int[] temp = new int[upperB - lowerB];
        int t = 0;
        // not overlap out of range
        while(i < mid && j < upperB){
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
        while(j < upperB){
            temp[t] = f[j];
            j++;
            t++;
        }
        // copy back to f
        i = lowerB;
        t = 0;
        while(t < temp.length){
            f[i] = temp[t];
            i++;
            t++;
        }
    }
}
