package SinglyLinkedListExp;

public class SinglyLisnkedListExp {
	
	private static Node head=null;
	
	
	static class Node
	{
		private int data;
		private Node next;
		
		public Node(int data)
		{
			this.data =data;
			this.next=null;
		}
	}

	public static void main(String[] args) {
		
		Node n = new Node(10);
		head = n;
		Node n1 = new Node(11);
		head.next=n1;
		
		Node disp = head;
		while(disp !=null)
		{
			System.out.println(disp.data);
			disp=disp.next;
		}
	}

}
