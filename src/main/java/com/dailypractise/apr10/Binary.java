/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr10;

/**
 *
 * @author luyi
 */
public class Binary {

    public static int binary(int[] f, int t) {
        int l = 0;
        int r = f.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (f[mid] == t) {
                return mid;
            } else if (f[mid] < t) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    // find the >=target in the leftest side
    //寻找第一个大于等于目标值的位置（左边界）
    public static int finLeftestBinary(int[] f, int target) {
        int l = 0;
        int r = f.length - 1;
        int found = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (f[mid] >= target) {
                found = mid;
                r = mid - 1;

            } else {
                l = mid + 1;
            }
        }
        return found;
    }

    // find the <=target in the leftest side
    public static int findRightestBinary(int[] f, int target) {
        int l = 0;
        int r = f.length - 1;
        int found = -1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (f[mid] <= target) {
                found = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return found;
    }

    //find a peak in an array that each neibour number is not same
    public static int peak(int[] f) {

        // only have one item, return it
        if (f.length == 1) {
            return 0;
        }

        // first item greater than second, renturn first
        if (f[0] > f[1]) {
            return 0;
        }

        // last item greater than second last one, return last one
        if (f[f.length - 1] > f[f.length - 2]) {
            return (f.length - 1);
        }

        // binary find
        int found = -1;
        // already check the f[0] and f[f.length -1], just skip them
        int l = 1;
        int r = f.length - 2;
        while (l <= r) {
            int mid = (l + r) / 2;
            // 如果左边比中间大,那么峰值在左边
            if (f[mid] < f[mid - 1]) {
                r = mid - 1;
                //如果右边比中间大,峰值在右边
            } else if (f[mid] < f[mid + 1]) {

                l = mid + 1;
            } else {
                // 此时中间比左右都大,mid就是峰值
                found = mid;
                break;
            }
        }
        return found;
    }

}
