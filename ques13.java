// Write a Java program to remove the nth element from the end of a given list.
//-----------------------------------------------------------------------------------//

import java.util.Scanner;

class ListNode{
    int val;
    ListNode next;

    ListNode(int item){
        this.val = item;
        this.next = null;
    }

}

public class ques13 {
    public static void main(String[] args) {
        ques13 obj = new ques13();
        Scanner input = new Scanner(System.in);

        ListNode head = obj.createlinklist();

        System.out.println("Original List : ");
        obj.printer(head);

        System.out.print("Enter the number index that wanted to remove(count from end): ");
        int num = input.nextInt();

        ListNode newhead = obj.removeNthfromEnd(head,num);

        System.out.println("Modified List : ");
        obj.printer(newhead);

    }

    ListNode createlinklist(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next =new ListNode(3);
        head.next.next.next =new ListNode(4);
        head.next.next.next.next =new ListNode(5);

        return head;  
    }

    void printer(ListNode list){
        while(list != null){
            System.out.print(list.val + "->");
            list = list.next;   
        }
        System.out.println("null");
    }

    ListNode removeNthfromEnd(ListNode head, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;

        // Step 1: Move `first` pointer `n + 1` steps ahead, if possible
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        
        while (first !=null){
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return dummy.next;

    }
    
}
