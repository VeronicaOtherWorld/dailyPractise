/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.mar27;

/**
 *
 * @author luyi
 */
public class Bubble {
    
    public static void bubble(int[]arr){
        int temp = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                // if the pervious greater than after one
                if(arr[j - 1] > arr[j]){
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
}
