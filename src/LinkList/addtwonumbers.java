/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Wali
 */

  //Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        int carry = 0, sum = 0;
        ListNode result = head;
        while(l1 != null || l2 != null){    //check if either is non null
            int v1 = l1!=null ? l1.val : 0;
            int v2 = l2!=null ? l2.val : 0;
            
            sum = v1 + v2 + carry;
            carry = sum/10;
            result.next = new ListNode(sum%10);
            
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
            result = result.next;
        }
        if (carry>0){   //for cases like 9+9 or 99+99
            result.next = new ListNode(carry);
            result = result.next;
        }
        return head.next;  
    }
        
    }
public class addtwonumbers {
    
        public static void main(String args[])
        {
            ListNode l1=new ListNode(7);
            ListNode l2=new ListNode(10);
            Solution s= new Solution();
            ListNode rs=s.addTwoNumbers(l1, l2);
            System.out.println("Additon is : " +rs.val + rs.next);
         
        }
}
