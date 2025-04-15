/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr15;

/**
 *
 * @author luyi
 */
public class ListNode {

    public ListNode next;
    public int el;

    public ListNode(int el) {
        this.el = el;
    }

    public ListNode(ListNode next, int el) {
        this.next = next;
        this.el = el;
    }

}