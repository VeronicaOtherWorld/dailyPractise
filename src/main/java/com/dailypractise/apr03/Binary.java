/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr03;

/**
 *
 * @author luyi
 */
public class Binary {
    public static int binary(int[] f, int t){
        int left = 0;
        int right = f.length -1;
        while(left <= right){
            int mid = left + (right - left) /2;
            if(f[mid] == t){
                return mid;
            } else if(f[mid] < t){
                left = mid + 1;
                
            } else {
                right = mid -1;
            }
        }
        return -1;
    }
}
