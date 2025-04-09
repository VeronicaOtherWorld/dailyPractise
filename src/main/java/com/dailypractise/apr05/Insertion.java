/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr05;

/**
 *
 * @author luyi
 */
public class Insertion {
    public static void selection(int[] arr){
        int sortedindex = 1;
        while(sortedindex < arr.length){
            int current = sortedindex;
            while(current > 0 && arr[current - 1] > arr[current]){
                int temp = arr[current];
                arr[current] = arr[current - 1];
                arr[current -1] = temp;
                current--;
            }
            sortedindex++;
        }
    }
}
