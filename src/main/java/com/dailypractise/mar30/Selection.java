/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.mar30;

/**
 *
 * @author luyi
 */
public class Selection {
    public static void selection(int[] arr){
        for(int sortedindex  = 0; sortedindex < arr.length; sortedindex++){
            int smallone = sortedindex;
            // +1
            for(int queryindex = sortedindex + 1; queryindex < arr.length;queryindex++){
                if(arr[queryindex] < arr[smallone]){
                    smallone = queryindex;
                }
            }
            //swap
            int temp = arr[sortedindex];
            arr[sortedindex] = arr[smallone];
            arr[smallone] = temp;
        }
    } 
    
}
