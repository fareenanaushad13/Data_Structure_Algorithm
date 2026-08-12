public class RemoveDuplicate {
    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;

        }
    }
    public static ListNode deleteDuplicate(ListNode head){
        if(head == null){
            return head;
        }

        ListNode current = head;

        while (current != null && current.next != null) {
            if(current.val == current.next.val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(3);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(1);

        head = deleteDuplicate(head);
        ListNode current = head;

        while(current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
