public class LinkedListCycle{
    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static boolean hasCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //1 step
            fast = fast.next.next; //2 steps

            if(slow == fast){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        //creating nodes
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);
         ListNode fith = new ListNode(-4);

        //connecting nodes
        head.next = second;
        second.next = third;
        third.next = fourth;

        //creating cycle
        fourth.next = second;

        boolean result = hasCycle(head);
        System.out.println("Cycle Exists = " + result);
    }
}