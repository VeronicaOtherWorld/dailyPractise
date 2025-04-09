/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.mar27;

/**
 *
 * @author luyi
 */
public class Selection {
    public static void selection(int[] arr){
        // for loop whole array
        for(int sortedindex = 0; sortedindex < arr.length; sortedindex++){
            int smallest = sortedindex;
            for(int queryindex = sortedindex + 1; queryindex < arr.length; queryindex++){
                if(arr[queryindex] < arr[smallest]){
                    smallest = queryindex;
                }
            }
            // swap the element
            int temp = arr[sortedindex];
            arr[sortedindex] = arr[smallest];
            arr[smallest] = temp;
        }
    }
}
