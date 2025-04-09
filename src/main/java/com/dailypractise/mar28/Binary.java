/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.mar28;

/**
 *
 * @author luyi
 */
public class Binary {
    
    public static int binary(int target, int[] arr){
        int left = 0;
        int right = arr.length - 1;
        int foundIndex = -1;
        while(left <= right){
            int mid = left + (right - left) /2;
            if(arr[mid] == target){
                foundIndex = mid;
            } else if (arr[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return foundIndex;
    }
    
}
