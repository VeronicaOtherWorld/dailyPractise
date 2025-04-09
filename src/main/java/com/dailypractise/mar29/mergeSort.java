/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.mar29;

/**
 *
 * @author luyi
 */
public class mergeSort {

    public static void main(String[] args) {

    }

    public static void mergeSort(int[] f, int l, int u) {
        // when l +1 < u
        // keep going
        while (l + 1 < u) {
            // find the middle one
            int mid = (l + u) / 2;
            mergeSort(f, l, mid);
            mergeSort(f, mid, u);
            merge(f, l, mid, u);
        }
    }

    public static void merge(int[] f, int l, int mid, int u) {
        int i = l;
        int j = mid;
        // temp to save the values
        int[] temp = new int[ u - l];
        int t = 0;
        while(i < mid && j < u){
            if(f[i]<= f[j]){
                temp[t] = f[i];
                i++;
                j++;
                
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
        
        while(j< u){
            temp[t] = f[j];
            j++;
            t++;
        }
        
        // copy back to temp[]
        i = l;
        t = 0;
        while(t < temp.length){
            f[i] = temp[t];
            i++;
            j++;
        }
    }
}
