/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.mar28;

/**
 *
 * @author luyi
 */
public class Selection {

    public static void selection(int[] arr) {
        for (int sortedindex = 0; sortedindex < arr.length;
                sortedindex++) {
            int smallest = sortedindex;
            //should not start with 0, equals to sortedindex
            for (int query = sortedindex + 1; query < arr.length;
                    query++) {
                if(arr[query] < arr[smallest]){
                    smallest = query;
                }
            }
            // swap
            int temp = arr[sortedindex];
            arr[sortedindex] = arr[smallest];
            arr[smallest] = temp;
        }
    }

}
