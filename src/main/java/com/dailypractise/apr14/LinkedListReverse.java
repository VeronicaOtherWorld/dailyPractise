/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr14;

/**
 *
 * @author luyi
 */
public class LinkedListReverse {
    // reverse singly linked list

    public LinkedNode reverse(LinkedNode head) {
        LinkedNode pre = null;
        LinkedNode next = null;

        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;

    }

    /*
    // 假设：head1: 1 → 3 → 5
    //      head2: 2 → 4 → 6

    // 起始 head = 1
    // 比较 3 和 2 → 接 2
    // 比较 3 和 4 → 接 3
    // 比较 5 和 4 → 接 4
    // 比较 5 和 6 → 接 5
    // 接上 6
    
    head: merged head, return result
    current1: reference to head1
    current2: reference to head2
    pre: the previous merged node
    
     */
    // merge 2 ascend singlylinked list
    public LinkedNode mergeTwoLists(LinkedNode head1, LinkedNode head2) {
        // 如果其中一个链表为空，直接返回另一个（无需合并）
        if (head1 == null || head2 == null) {
            return head1 == null ? head2 : head1;
        }

        // 初始化合并后链表的起点 head
        // 选择 head1 和 head2 中较小的作为头节点
        LinkedNode head = head1.element <= head2.element ? head1 : head2;

        // current1 指向 head 所属链表的下一个节点
        LinkedNode current1 = (head == head1) ? head1.next : head1;
        // current2 指向另一个链表的当前节点
        LinkedNode current2 = (head == head1) ? head2 : head2.next;

        // pre 表示当前合并链表的最后一个节点，用于接上新节点
        LinkedNode pre = head;

        // 遍历两个链表，同时处理每一对节点
        while (current1 != null && current2 != null) {
            if (current1.element <= current2.element) {
                // current1 比较小，接到 pre 后面
                pre.next = current1;
                current1 = current1.next; // 移动 current1 指针
            } else {
                // current2 比较小，接到 pre 后面
                pre.next = current2;
                current2 = current2.next; // 移动 current2 指针
            }
            pre = pre.next; // pre 始终指向当前合并后的最后一个节点
        }

        // 有一方先遍历完了，把另一方剩下的全部接上
        pre.next = (current1 != null) ? current1 : current2;

        // 返回合并后的链表头节点
        return head;
    }
}

class LinkedNode {

    protected int element;
    protected LinkedNode next;

    public LinkedNode(int element) {
        this.element = element;
    }

    public LinkedNode(int element, LinkedNode next) {
        this.element = element;
        this.next = next;
    }
}
