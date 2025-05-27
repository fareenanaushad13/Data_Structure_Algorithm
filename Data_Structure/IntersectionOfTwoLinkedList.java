public class IntersectionOfTwoLinkedList {

    static class Node {
        int val;
        Node next;
    }

    static Node intersect(Node l1, Node l2) {
        if (l1 == null || l2 == null) return null;

        Node p1 = l1, p2 = l2;

        while (p1 != p2) {
            p1 = (p1 == null) ? l2 : p1.next;
            p2 = (p2 == null) ? l1 : p2.next;
        }

        return p1;
    }

    public static void main(String[] args) {
        Node newNode;

        // List 1: 1 -> 2 -> 3 -> 4
        Node head1 = new Node();
        head1.val = 1;

        newNode = new Node();
        newNode.val = 2;
        head1.next = newNode;

        Node common = new Node();
        common.val = 3;
        newNode.next = common;

        newNode = new Node();
        newNode.val = 4;
        common.next = newNode;

        // List 2: 5 -> 3 -> 4 
        Node head2 = new Node();
        head2.val = 5;

        head2.next = common; // intersection here

        Node result = intersect(head1, head2);

        if (result != null) {
            System.out.println("Intersection at node with value: " + result.val);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
