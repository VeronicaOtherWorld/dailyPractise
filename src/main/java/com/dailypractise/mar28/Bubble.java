/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.mar28;

/**
 *
 * @author luyi
 */
public class Bubble {
    public static void bubble(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i< n; i++){
            for(int j = 0; j < (n - i); j++){
                if(arr[j - 1] > arr[j]){
                    temp = arr[j - 1];
                    arr[j -1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
