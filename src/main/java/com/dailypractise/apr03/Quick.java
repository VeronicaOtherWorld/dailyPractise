/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr03;

/**
 *
 * @author luyi
 */
public class Quick {
    public static void main(String[] args) {
        int[] temp = {1, 5, 7,9, 3,2};
            int[] f = quick(temp, 0, temp.length - 1);
            for (int i = 0; i < f.length; i++) {
                System.out.println(f[i]);
        }
    }
    // start and end are index not values
    public static int[] quick(int[] f, int start, int end){
        if(start < end){
            int index = partition(f, start, end);
            quick(f, start, index -1);
            quick(f, index + 1, end);
        }
        return f;
    }
    
    public static int partition(int[] f, int start, int end){
        int pivot = f[end];
        int index = start;
        for (int i = start; i < end; i++) {
            if(f[i]<= pivot){
                int temp = f[i];
                f[i] = f[index];
                f[index] = temp;
                index++;
            }
        }
        // swap
        int temp = f[index];
        f[index] = f[end];
        f[end] = temp;
        return index;
    }
}
