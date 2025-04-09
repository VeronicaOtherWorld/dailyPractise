/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr03;

/**
 *
 * @author luyi
 */
public class Insertion {
    public static void insertion(int[] a){
        int sortedindex = 1;
        while(sortedindex < a.length){
            int current = sortedindex;
            while(current > 0 && a[current - 1] > a[current]){
                int temp = a[current];
                a[current] =a[current - 1];
                a[current -1] = temp;
                current--;
            }
            sortedindex++;
        }
    }
    
}
