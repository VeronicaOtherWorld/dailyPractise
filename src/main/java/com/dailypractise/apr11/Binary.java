/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr11;

/**
 *
 * @author luyi
 */
public class Binary {
    public static int binary(int[] f, int t){
        int l = 0;
        int r = f.length-1;
        while(l<=r){
            int mid = (r + l) /2;
            if(f[mid]== t){
                return mid;
            } else if(f[mid] < t){
                l = mid +1;
            } else {
                r = mid -1;
            }
        }
        return -1;
    }
    // find the >= num in the leftset side
    public static int left(int[] f, int t){
        int l = 0;
        int r = f.length -1;
        int found = -1;
        while(l <=r){
            int mid = (r + l) /2;
            if(f[mid]>= t){
                found = mid;
                r = mid -1;
            } else{
                l = mid +1;
            } 
        }
        return found;
    } 
    
    // find the <= num in the rightest side
    public static int right(int[] f, int t){
        int l = 0;
        int r = f. length -1;
        int found = -1;
        while(l <= r){
            int mid = (r +l) /2;
            if(f[mid]<= t){
                found = mid;
                l = mid +1;
            }  else {
                r = mid  -1;
            }
        }
        return found;
    }
    
    public static int peak(int[] f){
        int len = f.length -1;
        if(f ==  null|| f.length == 0){
            return -1;
        }
        
        if(f[0]> f[1]){
            return 0;
        }
        
        if(f[len]> f[len -1]){
            return len;
        }
        
        int l = 1;
        int r = len -2;
        int mid = 0;
        while(l<=r){
            mid = (r + l) /2;
            if(f[mid] < f[mid -1]){
                r = mid -1;
            } else if(f[mid] < f[mid + 1]){
                l = mid +1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    
}
