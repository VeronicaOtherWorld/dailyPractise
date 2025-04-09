/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr09;

/**
 *
 * @author luyi
 */
public class Binary {

    // normal method
    public static int binary(int[] f, int t) {
        int l = 0;
        int r = f.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
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

    // find the index of the value that >= target in the leftest side
    public static int binaryLeftest(int[] f, int t) {
        int found = -1;

        int l = 0;
        int r = f.length - 1;
        //二分的起始边界（闭区间 [l, r]）
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (f[mid] >= t) {
                found = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return found;

    }

    // find the index of the value that <= target in the rightest side
    public static int binaryRight(int[] f, int target) {
        int found = -1;
        int l = 0;
        int r = f.length - 1;
        int mid = 0;
        while (l <= r) {
            mid = l + (l - r) / 2;
            if (f[mid] <= target) {
                found = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return found;
    }

    //FindPeakElement
    // in a disordered array, the adjacent numbers are not equal
    // find a peak element
    public static int findPeakElement(int[] f) {
        int found = -1;
        int len = f.length;

        // 特殊情况 1：数组只有一个元素，那它自己就是峰值
        if (len == 1) {
            found = 0;
            return found;
        }

        // 特殊情况 2：第一个元素比第二个大，说明开头就是峰值
        if (f[0] > f[1]) {
            found = 0;
            return found;
        }

        // 特殊情况 3：最后一个元素比倒数第二个大，说明结尾是峰值
        if (f[len - 1] > f[len - 2]) {
            found = len - 1;
            return found;
        }

        // 从中间部分进行二分查找，排除两端
        int l = 1;
        int r = len - 2;

        while (l <= r) {
            int mid = (l + r) / 2;

            // 如果左边比中间大，说明峰值在左边
            if (f[mid - 1] > f[mid]) {
                r = mid - 1;
            } // 如果右边比中间大，说明峰值在右边
            else if (f[mid] < f[mid + 1]) {
                l = mid + 1;
            } // 否则：中间比左右都大，说明 mid 就是峰值
            else {
                found = mid;
                break;
            }
        }

        return found;
    }
}
