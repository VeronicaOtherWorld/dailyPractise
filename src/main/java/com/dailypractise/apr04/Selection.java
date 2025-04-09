/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr04;

/**
 *
 * @author luyi
 */
public class Selection {
    public static void selection(int[] f){
        for (int sortedindex = 0; sortedindex < f.length; sortedindex++) {
            int small = sortedindex;
            for (int query = sortedindex +1; query < f.length; query++) {
                if(f[query] < f[small]){
                    small = query;
                }
            }
            // swap
            int temp = f[sortedindex];
            f[sortedindex] = f[small];
            f[small] = temp;
        }
    }
}
