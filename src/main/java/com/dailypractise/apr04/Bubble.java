/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr04;

/**
 *
 * @author luyi
 */
public class Bubble {
    public static void bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j -1]){
                    int temp = arr[j];
                    arr[j] = arr[j -1];
                    arr[j -1 ] = temp;
                }
            }
        }
    }
}
