package solutionnew;
import java.util.*;
//����һ������������ֵ��β��ͷ��˳�򷵻�һ��ArrayList��
//����˼·
//һ�ַ���������ջ��ʵ�֣�
//����һ�ַ�������������ָ�������ת���ؼ��� r ָ�뱣��Ͽ��Ľڵ㡣
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
