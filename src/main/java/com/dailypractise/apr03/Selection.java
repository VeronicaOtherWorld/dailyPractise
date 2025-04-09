/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr03;

/**
 *
 * @author luyi
 */
public class Selection {
    public static void selection(int[] f){
        for (int sortedindex = 0; sortedindex < f.length; sortedindex++) {
            int smallest = sortedindex;
            for (int query = sortedindex + 1; query < f.length; query++) {
                if(f[smallest] > f[query]){
                    smallest = query;
                }
            }
            int temp = f[sortedindex];
            f[sortedindex] = f[smallest];
            f[smallest] = temp;
        }
    }
}
