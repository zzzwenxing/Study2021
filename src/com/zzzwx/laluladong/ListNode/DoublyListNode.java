package com.zzzwx.laluladong.ListNode;

import java.text.MessageFormat;
import java.util.Arrays;

/**
 * @Description: 双链表
 * @Author: zhuwenxing
 * @Date: 2026-01-10 09:47
 */

public class DoublyListNode {

    public int val;
    public DoublyListNode prev, next;

    public DoublyListNode(int x) {
        val = x;
    }

    public static DoublyListNode createDoublyLinkedList(int[] arr, String msg) {
        System.out.printf("%s:createDoublyLinkedList:%s%n", msg, Arrays.toString(arr));
        if (arr == null || arr.length == 0) {
            return null;
        }
        DoublyListNode head = new DoublyListNode(arr[0]);
        DoublyListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            DoublyListNode newNode = new DoublyListNode(arr[i]);
            curr.next = newNode;
            newNode.prev = curr;
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {

        // 创建一条双链表
        DoublyListNode head = createDoublyLinkedList(new int[]{1, 2, 3, 4, 5}, "创建一条双链表");
        DoublyListNode tail = null;

        // 从头节点向后遍历双链表
        for (DoublyListNode p = head; p != null; p = p.next) {
            System.out.println("从头节点向后遍历双链表:" + p.val);
            tail = p;
        }
        System.out.println("\n");

        // 从尾节点向前遍历双链表
        for (DoublyListNode p = tail; p != null; p = p.prev) {
            System.out.println("从尾节点向前遍历双链表:" + p.val);
        }
        System.out.println("\n");


        // 在双链表头部插入新元素
        DoublyListNode head1 = createDoublyLinkedList(new int[]{1, 2, 3, 4, 5}, "在双链表头部插入新元素");

        DoublyListNode newHead = new DoublyListNode(0);

        newHead.next = head1;
        head1.prev = newHead;
        head1 = newHead;
        for (DoublyListNode p = head1; p != null; p = p.next) {
            System.out.println("在双链表头部插入新元素:" + p.val);
        }
        System.out.println("\n");


        // 在双链表尾部插入新元素
        DoublyListNode head2 = createDoublyLinkedList(new int[]{1, 2, 3, 4, 5}, "在双链表尾部插入新元素");
        DoublyListNode tail2 = head2;
        while (tail2.next != null) {
            tail2 = tail2.next;
        }
        DoublyListNode newTail = new DoublyListNode(6);
        newTail.prev = tail2;
        tail2.next = newTail;
        for (DoublyListNode p = head2; p != null; p = p.next) {
            System.out.println("在双链表尾部插入新元素:" + p.val);
        }
        System.out.println("\n");

        //在双链表中间插入新元素[66]
        DoublyListNode head3 = createDoublyLinkedList(new int[]{1, 2, 3, 4, 5}, "在双链表中间插入新元素[66]");
        DoublyListNode newHead3 = head3;

        // 想要插入到索引 3（第 4 个节点）
        // 需要操作索引 2（第 3 个节点）的指针
        for (int i = 0; i < 2; i++) {
            newHead3 = newHead3.next;
        }

        //创建新节点
        DoublyListNode newNode = new DoublyListNode(66);
        newNode.next = newHead3.next;
        newNode.prev = newHead3;

        // 插入新节点
        newHead3.next = newNode;
        newHead3.next.prev = newNode;

        for (DoublyListNode p = head3; p != null; p = p.next) {
            System.out.println("在双链表中间插入新元素[66]:" + p.val);
        }
        System.out.println("\n");

        //在双链表中删除一个节点
        DoublyListNode head4 = createDoublyLinkedList(new int[]{1, 2, 3, 4, 5, 6}, "在双链表中删除一个节点");
        DoublyListNode p4 = head4;

        // 删除第 4 个节点
        // 先找到第 3 个节点
        for (int i = 0; i < 2; i++) {
            p4 = p4.next;
        }
        DoublyListNode del = p4.next;
        p4.next = del.next;
        del.next.prev = p4;

        // 删除置空好习惯
        del.prev = null;
        del.next = null;

        for (DoublyListNode p = head4; p != null; p = p.next) {
            System.out.println("在双链表中删除一个节点:" + p.val);
        }
        System.out.println("\n");

        // 在双链表头部删除元素
        DoublyListNode head5 = createDoublyLinkedList(new int[]{1, 2, 3, 4, 5, 6}, "在双链表头部删除元素");
//        DoublyListNode p5 = head5;
//        p5 = p5.next;
//        p5.next.prev = null;
//        head5= p5;
        DoublyListNode delNode = head5;
        head5 = head5.next;
        head5.next.prev = null;
        delNode.next = null;

        for (DoublyListNode p = head5; p != null; p = p.next) {
            System.out.println("在双链表中删除一个节点:" + p.val);
        }
        System.out.println("\n");

        //在双链表尾部删除元素
        DoublyListNode head6 = createDoublyLinkedList(new int[]{1, 2, 3, 4, 5, 6},"在双链表尾部删除元素");
        DoublyListNode tailNode =head6;
        while (tailNode.next!=null){
            tailNode = tailNode.next;
        }
        DoublyListNode lastNode = tailNode.prev;
        lastNode.next =null;
        tailNode.prev = null;

        for (DoublyListNode p = head6; p != null; p = p.next) {
            System.out.println("在双链表尾部删除元素:" + p.val);
        }
        System.out.println("\n");





    }



}
