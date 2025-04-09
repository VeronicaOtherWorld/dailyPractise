/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr02;

/**
 *
 * @author luyi
 */
public class Binary {
    public static int binary(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] < target){
                left = mid + 1;
                
            } else {
                right = mid -1;
            }
        }
        return -1;
    }
}
