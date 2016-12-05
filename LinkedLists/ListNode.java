package linkedLists;

public class ListNode {
	public int data;
	public ListNode next;
	
	public ListNode(){
		this(0,null);
	}
	public ListNode(int data){
		this(data,null);
	}
	public ListNode(int data,ListNode next){
		this.data=data;
		this.next=next;
	}
	public static void main(String[] args) {
		ListNode list=new ListNode(3,new ListNode(7,new ListNode(12)));
		ListNode current=list;
		while(current!=null){
			System.out.println(current.data);
			current=current.next;
		}
	}
}
