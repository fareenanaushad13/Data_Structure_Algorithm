public class PalindromeLinkedList{
    static class Node{
        int val;
        Node next;
    };

    static Node newNode(int key){
        Node temp = new Node();
        temp.val = key;
        temp.next = null;
        return temp;
    }

    static Node revere(Node head){
        Node prev = null;
        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    static boolean isPalindrome(Node head){
        Node fast= head,slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast!= null){
            slow = slow.next;
        }
        slow = revere(slow);
        fast = head;

        while (slow != null && fast != null) {
            if(slow.val != fast.val){
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

public static void main(String[] args) {
    Node head = newNode(1);
    head.next = newNode(2);
    head.next.next = newNode(2);
    head.next.next.next = newNode(1);

    System.out.println(isPalindrome(head));
}
}