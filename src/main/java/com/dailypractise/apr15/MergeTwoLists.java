/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailypractise.apr15;

/**
 *
 * @author luyi
 */
public class MergeTwoLists {
    public static void main(String[] args) {
        
    }
    
    
    
    public static ListNode merge(ListNode head1, ListNode head2){
        // if one list is empty, return another, do not need merge
        if(head1 == null || head2 == null){
            return head1 == null ? head2 : head1;
        }
        
        // init the merged link head
        // 选择一个小的作为新链表的head

        ListNode head = head1.el <= head2.el ? head1 : head2;
        
        
        //谁当了头，谁就跳过，另一个从头开始。
        
        // cur1 point to next node of the head linked list
        /*
        如果新链表的头 head 是 head1，那说明我们已经用了 head1 的第一个节点了
        （也就是 head1 本身），接下来该用 head1.next 了。
        否则，如果 head 是 head2，那 head1 还一个都没用，所以我们从 head1 本身开始。
        */
        ListNode cur1 = (head == head1) ? head1.next : head1;
        
        // cur2 point to current node of the another linked list
        /*
        如果 head 是 head1，那 head2 还没用过，所以我们从 head2 开始。      
        如果 head 是 head2，那我们已经用了 head2 的第一个节点了，所以从 head2.next 开始
        */
        ListNode cur2 = (head == head1) ? head2 : head2.next;
        
        //pre the last node of the head list, connect to the new node
        
        ListNode pre = head;
        
        while(cur1 != null && cur2 != null){
            if(cur1.el <= cur2.el){
                //cur1 is smaller add to the pre
                pre.next = cur1;
                cur1 = cur1.next;
            } else {
                // cur2 is smaller, add to the pre
                pre.next = cur2;
                cur2 = cur2.next;
            }
            
            // pre always piont to the last node
            pre = pre.next;
        }
        //if any list is finsied, and rest of the nodes to the pre
        pre.next = (cur1 != null) ? cur1 : cur2;
        
        return head;
    }
}
