/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.mar27;

/**
 *
 * @author luyi
 */
public class Quick {
    public static void quick(int[] f, int start, int end){
        if(start < end){
            int partitionindex = partition(f, start, end);
            quick(f, start, partitionindex - 1);
            quick(f, partitionindex + 1, end);
        }
    }
    
    public static int partition(int[]f, int start, int end){
        int pivot = f[end];
        int partitionindex = start;
        for(int i = start; i< end; i++){
            if(f[i] <=pivot){
                // swap the element is less than pivot
                swap(f, i ,partitionindex);
                partitionindex++;
            }
        }
        // finally swap pivot with element at the partition index
        swap(f, partitionindex, end);
        return partitionindex;
    }
    
    static void swap(int[]f, int i, int j){
        int temp = f[i];
        f[i] = f[j];
        f[j] = temp;
    }
    
}
