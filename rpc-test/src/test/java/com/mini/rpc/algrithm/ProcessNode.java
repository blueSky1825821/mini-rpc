package com.mini.rpc.algrithm;

/**
 * DESCRIPTION:
 * <P>
 * </p>
 *
 * @author wangmin
 * @since 2022-01-27 16:00
 */
public class ProcessNode {

    static class Node {
        private Integer value;
        private Node next;

        public Node(Integer value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    /**
     * node 递增
     *
     * @param first  first
     * @param second second
     * @return node merge
     */
    public static void mergeTwo(Node head, Node first, Node second) {
        if (first == null) {
            head.next = second;
            return;
        }
        if (second == null) {
            head.next = first;
            return;
        }
        Node fNext = first.next;
        Node sNext = second.next;
        if (first.value < second.value) {
            head.next = first;
            first.next = second;
            second = fNext;
            first = first.next;
        } else {
            head.next = second;
            second.next = first;
            first = sNext;
            second = second.next;
        }
        mergeTwo(head.next, first, second);
    }

    public static void main(String[] args) {
        Node first = new Node(1, new Node(4, new Node(7, null)));
        Node second = new Node(2, new Node(3, new Node(8, new Node(9, null))));
        Node head = new Node(-1, null);
        mergeTwo(head, first, second);
        head = head.next;

        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }
}
