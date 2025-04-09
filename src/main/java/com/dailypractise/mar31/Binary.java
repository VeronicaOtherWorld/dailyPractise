/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.mar31;

/**
 *
 * @author luyi
 */
public class Binary {
    public static int search(int[] f, int target){
        int left = 0;
        int right = f.length -1;
        while(left <= right){
            int mid = left + (right - left) /2;
            if(f[mid] == target){
                return mid;
            } else if(f[mid] < target){
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return -1;
    }
}
