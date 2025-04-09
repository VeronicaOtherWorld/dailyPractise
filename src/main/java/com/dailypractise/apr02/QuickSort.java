/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr02;

/**
 *
 * @author luyi
 */
public class QuickSort {
    public static void quick(int[] a, int start, int end) {
    
        if(start < end){
            int index = partition(a, start, end);
            quick(a, start, index -1);
            quick(a, index + 1, end);
        }
    }
    
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int index = start;
        for (int i = start; i < end; i++) {
            if(arr[i]<= pivot){
                int temp = arr[i];
                arr[i] =arr[index];
                arr[index] =temp;
                index++;
            }
        }
        int temp = arr[index];
        arr[index] = arr[end];
        arr[end] = temp;
        return index;
    }

}
