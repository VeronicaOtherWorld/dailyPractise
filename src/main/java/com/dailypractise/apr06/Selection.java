/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr06;

/**
 *
 * @author luyi
 */
public class Selection {
    public static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int small = i;
            for (int query = i + 1; query < arr.length; query++) {
                if(arr[small] > arr[query]){
                    small = query;
                }
            }
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }
    }
    
}
