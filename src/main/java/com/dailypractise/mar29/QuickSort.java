/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.mar29;

/**
 *
 * @author luyi
 */
public class QuickSort {
    public static void quickSort(int[] f, int start, int end){
        if(start < end){
            int partitionIndex = partition(f, start, end);
            quickSort(f, start, partitionIndex - 1);
            quickSort(f, partitionIndex + 1, end);
        }
    }
    
    static int partition(int[] f, int start, int end){
        int pivot = f[end];
        int partitionIndex = start;
        for (int i = start; i < end; i++) {
            if(f[i] <= pivot){
                // swap the element
                int temp = f[i];
                f[i] = f[partitionIndex];
                f[partitionIndex] = temp;
                partitionIndex++;
            }
        }
        // finally swap the partitionIndex with the end one
        int temp = f[partitionIndex];
        f[partitionIndex] = f[end];
        f[end] = temp;
        return partitionIndex;
    }
}
