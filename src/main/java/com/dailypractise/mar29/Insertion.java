/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.mar29;

/**
 *
 * @author luyi
 */
public class Insertion {
    public static void insertion(int[] arr){
        int sortedindex = 1;
        while(sortedindex < arr.length){
            int currentqueryindex = sortedindex;
            while(currentqueryindex > 0 
                    && arr[currentqueryindex] < arr[currentqueryindex - 1]){
                int temp = arr[currentqueryindex];
                arr[currentqueryindex] = arr[currentqueryindex - 1];
                arr[currentqueryindex - 1] = temp;
                currentqueryindex--;
            }
            sortedindex++;
        }
    }
}
