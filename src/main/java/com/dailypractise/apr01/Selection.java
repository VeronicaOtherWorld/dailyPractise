/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr01;

/**
 *
 * @author luyi
 */
public class Selection {
    public static void selection(int[] arr){
        for(int sortedindex = 0; sortedindex < arr.length; sortedindex++){
            int smallone = sortedindex;
            for(int current = sortedindex+1;current< arr.length;current++){
                if(arr[current] < arr[smallone]){
                    smallone = current; 
                }
            }
            // swap
            int temp = arr[sortedindex];
            arr[sortedindex] = arr[smallone];
            arr[smallone] = temp;
        }
    }
}
