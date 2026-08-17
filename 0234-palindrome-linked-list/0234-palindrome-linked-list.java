/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode check = head;
        while(check != null){
            s.push(check.val);
            check = check.next;
        }
        check = head;
        while(!s.empty() && check != null){
            if(s.pop()!=check.val)
                return false;
            check = check.next;
        }
        return true;
    }
}