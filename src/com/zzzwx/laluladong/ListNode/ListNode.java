package com.zzzwx.laluladong.ListNode;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        return head;
    }

    public static void main(String[] args) {
        // 单链表的遍历
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5});
        for (ListNode cur = head; cur != null; cur = cur.next) {
            System.out.println("单链表的遍历:" + cur.val);
        }
        System.out.println("\n");


        // 单链表头部插入新元素
        ListNode head1 = createLinkedList(new int[]{5, 4, 3, 2, 1});
        ListNode newHead = new ListNode(0);
        newHead.next = head1;
        head1 = newHead;
        for (ListNode cur = head1; cur != null; cur = cur.next) {
            System.out.println("单链表头部插入新元素" + cur.val);
        }
        System.out.println("\n");


        // 单链表尾部插入新元素
        ListNode head2 = createLinkedList(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});
        ListNode p = head2;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new ListNode(0);

        for (ListNode cur = head2; cur != null; cur = cur.next) {
            System.out.println("单链表尾部插入新元素" + cur.val);
        }
        System.out.println("\n");



        //单链表中间第三个插入新元素[66]
        ListNode head3 = createLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode p3 = head3;
        for (int i = 0; i < 2; i++) {
            p3 = head3.next;
        }
        ListNode newHead3 = new ListNode(66);
        newHead3.next = p3.next;
        p3.next = newHead3;
        for (ListNode cur = head3; cur != null; cur = cur.next) {
            System.out.println("单链表中间第三个插入新元素[66]" + cur.val);
        }
        System.out.println("\n");


        //在单链表中删除一个节点
        ListNode head4 = createLinkedList(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});
        ListNode p4 = head4;
        // 删除第 4 个节点，要操作前驱节点
        for (int i = 0; i < 2; i++) {
            p4 = head4.next;
        }
        // 此时 p 指向第 3 个节点，即要删除节点的前驱节点
        // 把第 4 个节点从链表中摘除
        p4.next = p4.next.next;
        for (ListNode cur = head4; cur != null; cur = cur.next) {
            System.out.println("在单链表中删除一个节点" + cur.val);
        }
        System.out.println("\n");


        //在单链表尾部删除元素
        ListNode head5 = createLinkedList(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});
        ListNode p5 = head5;
        while (p5.next.next != null) {
            p5 = p5.next;
        }
        p5.next = null;
        for (ListNode cur = head5; cur != null; cur = cur.next) {
            System.out.println("在单链表尾部删除元素" + cur.val);
        }
        System.out.println("\n");


        //在单链表头部删除元素
        ListNode head6 = createLinkedList(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});
        head6 = head6.next;
        for (ListNode cur = head6; cur != null; cur = cur.next) {
            System.out.println("在单链表头部删除元素" + cur.val);
        }
        System.out.println("\n");

    }

}
