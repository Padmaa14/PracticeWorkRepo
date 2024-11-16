package DataStructurePractice;

import java.util.List;

public class DSLinkedListSinglyPractice {

    public static void main(String arg[]) {
        ListNode obj1 = new ListNode(3);
        ListNode obj2 = new ListNode(2);
        ListNode obj3 = new ListNode(0);
        ListNode obj4 = new ListNode(-4);
        obj1.next = obj2;
        obj2.next = obj3;
        obj3.next = obj4;
        //obj4.next = obj;

        ListNode lkdList = new ListNode();
        lkdList.add(3);
        lkdList.add(2);
        lkdList.add(0);
        lkdList.add(-4);
        lkdList.display();

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    public ListNode head = null;
    public ListNode tail = null;

    ListNode(int val) {
        this.val = val;
        next = null;
    }

    public void add(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = newNode;
        }
    }

    public void display() {
        ListNode current = head;
        if (head == null) {
            System.out.println("Linked list is null");
            return;
        }
        while (current != null) {
            System.out.print(current.val + " | " + current.next+" -> ");
            current = current.next;
        }
    }

}