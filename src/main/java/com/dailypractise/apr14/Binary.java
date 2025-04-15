/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr14;

/**
 *
 * @author luyi
 */
public class Binary {
    public static int binary(int[] f, int t){
        int l = 0;
        int r = f.length -1;
        while(l<= r){
            int mid = (r + l)/2;
            if(f[mid] == t){
                return mid;
            } else if(f[mid] < t){
                l = mid +1;
            } else {
                r = mid -1;
            }
        
        } 
        return -1;
    }
    
    
    // >= t leftest
    public static int left(int[] f, int t){
        int l = 0;
        int r = f.length -1;
        int i = -1;
        while(l<= r){
            int mid = (r + l)/2;
            if(f[mid] >= t){
                i = mid;
                r = mid -1;
            } else {
                l = mid + 1;
            }
        }
        return i;
    }
    
    // <=t rightest
    public static int right(int[] f, int t){
                int l = 0;
        int r = f.length -1;
        int i = -1;
        while(l<= r){
            int mid = (r + l)/2;
            if(f[mid]<= t){
                i = mid;
                l = mid +1;
            } else {
                r = mid -1;
            }
        }
        return i;
    }
    
    public static int peak(int[] f){
        int len = f.length;
        if(len == 1){
            return 0;
        }
        if(f[0]> f[1]){
            return 0;
        }
        if(f[len -1] > f[len -2]){
            return len -1;
        }
        
        int l = 1;
        int r = len -2;
        while(l<= r){
            int mid = (l + r) /2;
            if(f[mid] < f[mid -1]){
                r = mid -1;
            }
            else if(f[mid] < f[mid +1]){
                l = mid +1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
