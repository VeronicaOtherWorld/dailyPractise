/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr02;

/**
 *
 * @author luyi
 */
public class Insertion {
    public static void insertion(int[] arr){
        //let sortedindex = 1
        int s = 1;
        while(s < arr.length){
            // let current = sortedindex then determine
            int c = s;
            while(c > 0 && arr[c] < arr[c - 1]){
                int temp = arr[c];
                arr[c] = arr[c -1];
                arr[c -1] = temp;
                c--;
            }
            s++;
        }
    }
}
