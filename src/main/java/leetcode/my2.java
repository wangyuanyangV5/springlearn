package leetcode;

/**
 * Created by dell on 2019/2/11.
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，
 * 并且它们的每个节点只能存储 一位 数字。如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 输出：7 -> 0 -> 8
 原因：342 + 465 = 807
 */
public class my2 {
    public static void main(String[] args) {
        ListNode l1 =  new ListNode(1);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);

        ListNode listNode = addTwoNumbers(l1,l2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode tmp = null;
        int flag = 0;
        ListNode first = l1;
        ListNode seconed = l2;
        while (first != null){
            int counter = flag;
            if(seconed != null){
                counter += seconed.val;
                seconed = seconed.next;
            }
            counter +=  first.val;
            first = first.next;
            if(result == null){
                result = new ListNode(counter % 10);
                tmp = result;
            }else {
                tmp.next = new ListNode(counter % 10);
                tmp = tmp.next;
            }
            flag = counter > 9 ? counter / 10 : 0;
        }
        while (seconed != null){
            int counter = flag;
            counter +=  seconed.val;
            seconed = seconed.next;
            if(result == null){
                tmp = new ListNode(counter % 10);
            }else {
                tmp.next = new ListNode(counter % 10);
                tmp = tmp.next;
            }
            flag = counter > 9 ? counter / 10 : 0;
        }
        while (flag != 0){
            tmp.next = new ListNode(flag % 10);
            tmp = tmp.next;
            flag = flag > 9 ? flag / 10 : 0;
        }
        return result;
    }

   static class ListNode{
       int val;
       ListNode next;
       ListNode(int x) { val = x; };
   }
}
