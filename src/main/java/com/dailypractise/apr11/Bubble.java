/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr11;

/**
 *
 * @author luyi
 */
public class Bubble {
    public static void bubble(int[] f){
        for (int i = 0; i < f.length; i++) {
            for (int j = 1; j < f.length - i; j++) {
                if(f[j]< f[j -1]){
                    int temp = f[j -1];
                    f[j -1] = f[j];
                    f[j] = temp;
                }
            }
        }
    }
    
}
