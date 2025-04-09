/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr08;

/**
 *
 * @author luyi
 */
public class Insertion {
    public static void selection(int[] f){
        int s = 1;
         while (s < f.length){
             int current = s;
             while(current > 0 && f[current -1] > f[current]){
                 int temp = f[current];
                 f[current] = f[current -1];
                 f[current -1] = temp;
                 current--;
             }
             s++;
         }
    }
}
