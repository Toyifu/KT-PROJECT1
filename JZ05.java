package solutionnew;
import java.util.*;
//输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
//解题思路
//一种方法是利用栈来实现；
//另外一种方法是利用三个指针把链表反转，关键是 r 指针保存断开的节点。
public class JZ05 {

//	public static ArrayList<Integer> printListFromTailToHead(ListNode l) 
//	    {
//		ArrayList<Integer> ans = new ArrayList<Integer>();
//	    	Stack<Integer> S = new Stack<Integer>();
//	    	while(l!=null) {S.push(l.val);l=l.next;}
//	    while(!S.isEmpty()) {ans.add(S.pop());}
//	    return ans;
//	    }
	
	
	public static ArrayList<Integer> printListFromTailToHead(ListNode l) 
	{
		        if(l == null){return new ArrayList<Integer>();}
		ListNode h =l; 
		ListNode c =l.next;
		while(c!=null)
		{
			ListNode t = c.next;
			c.next=h;
			h=c;
			c=t;
		}
		l.next = null;
		ArrayList<Integer> ANS = new ArrayList<Integer>();
		while(h!=null)
		{
			ANS.add(h.val);
			h=h.next;
		}
		return ANS;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		ListNode LLL = new ListNode(1);
		LLL.next =new ListNode(2);
		LLL.next.next =new ListNode(3);
//		LLL.next.next.next =new ListNode(4);
//		LLL.next.next.next.next =new ListNode(5);
//		LLL.next.next.next.next.next =new ListNode(6);
System.out.print(printListFromTailToHead(LLL));
	}

}
