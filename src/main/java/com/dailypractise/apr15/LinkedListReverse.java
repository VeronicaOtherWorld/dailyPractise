/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr15;

/**
 *
 * @author luyi
 */
public class LinkedListReverse {

    public static void main(String[] args) {

    }

    public static ListNode reverse(ListNode head) {
        ListNode next = null;
        ListNode pre = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}


