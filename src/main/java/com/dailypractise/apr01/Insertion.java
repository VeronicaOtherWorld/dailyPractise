/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr01;

/**
 *
 * @author luyi
 */
public class Insertion {
    public static void insertion(int[] arr){
        int sortedindex = 1;
        while(sortedindex < arr.length){
            int query = sortedindex;
            while(query > 0 && arr[query] < arr[query - 1]){
                int temp = arr[query];
                arr[query] = arr[query -1];
                arr[query -1] = temp;
                query--;
            }
            sortedindex++;
        }
    }
}
