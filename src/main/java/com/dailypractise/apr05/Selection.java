/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr05;

/**
 *
 * @author luyi
 */
public class Selection {
    public static void selection(int[] arr){
        for (int sorted = 0; sorted < arr.length; sorted++) {
            int small = sorted;
            for (int query = sorted + 1; query < arr.length; query++) {
                if(arr[small] > arr[query]){
                    small = query;
                }
            }
            int temp = arr[sorted];
            arr[sorted] = arr[small];
            arr[small] =temp;
        }
    }
}
