package com.supra;

import com.supra.practise.Node;

class MyLinkedList {

    private Node head;

    public MyLinkedList() { }

    public Node get(int index) {
        int count = 0;
        Node currentNode = head;
        while(count<index) {
            currentNode = currentNode.getNext();
            count++;
        }
        return currentNode;
    }

    public void addAtHead(int val) {
        Node newHeadNode = new Node(val);
        Node currentHead = head;
        newHeadNode.setNext(currentHead);
        head = newHeadNode;
    }

    public void addAtTail(int val) {
        Node newTailNode = new Node(val);
        Node currentNode = head;
        while(currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(newTailNode);
    }

    public void addAtIndex(int index, int val) {
        Node currentNode = new Node(val);
        Node prevNode = head;
        for(int i=0; i< index-1; i++) {
            prevNode = prevNode.getNext();
        }
        currentNode.setNext(prevNode.getNext());
        prevNode.setNext(currentNode);
    }

    public void deleteAtIndex(int index) {
        Node prevNode = get(index-1);
        Node currentNode = get(index);
        prevNode.setNext(currentNode.getNext());
        currentNode.setNext(null);
    }

    public static void main(String []s) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
        obj.addAtTail(3);
        obj.addAtIndex(1, 2);
        Node param_1 = obj.get(1);
        System.out.println(param_1.getValue());
        obj.deleteAtIndex(1);
        Node param_2 = obj.get(1);
        System.out.println(param_2.getValue());
    }
}
