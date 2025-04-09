/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr05;

/**
 *
 * @author luyi
 */
public class Quick {
    public static void quick(int[] arr, int start, int end){
        if(start<end){
            int index = partition(arr, start, end);
            quick(arr, start, index -1);
            quick(arr, index+ 1, end);
        }
    }
    
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int index = start;
        for (int i = start; i < end; i++) {
            if(arr[i]<=pivot){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        int temp = arr[end];
        arr[end] = arr[index];
        arr[index] = temp;
        return index; 
    }
}
