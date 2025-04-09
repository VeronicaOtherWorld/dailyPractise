/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.mar27;

/**
 *
 * @author luyi
 */
public class Binary {
    public static int search(int target, int[]arr){
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int foundindex = -1;
        while(left <= right){
            int mid = left + (right - left) /2;
            if(arr[mid] == target){
                foundindex = mid;
                return foundindex;
            } else if(arr[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return foundindex;
    }
}
