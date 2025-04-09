/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr05;

/**
 *
 * @author luyi
 */
public class Binary {
    public static int binary(int[] arr, int t){
        int l = 0;
        int r = arr.length - 1;
        while(l <=r){
            int mid = l + (r - l) /2;
            if(arr[mid] == t){
                return mid;
            } else if(arr[mid] < t) {
                l = mid +1;
            } else {
                r= mid - 1;
            }
        }
        return -1;
    }
}
