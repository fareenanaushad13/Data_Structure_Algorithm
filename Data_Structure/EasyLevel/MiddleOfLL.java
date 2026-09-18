import java.util.*;

public class MiddleOfLL{
    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }

public static ListNode middleNode(ListNode head){
    ListNode slow = head;
    ListNode fast = head;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }

    return  slow;
}

public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        ListNode head = null;
        ListNode tail = null;

        for(int i=0;i<n;i++){
            int value = sc.nextInt();
            ListNode newNode = new ListNode(value);

            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }

        ListNode middle = middleNode(head);

        System.out.print("Middle of LinkedList = ");

        while(middle != null){
            System.out.print(middle.val + " ");
            middle = middle.next;

            sc.close();
        }
    }
}