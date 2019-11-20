class Node
{
	Node next;
	int data;
	Node(int data)
	{
	   this.data=data;
	}
	
}
class LinkedListWithoutInterface2
{
	  public static void main(String [] args)
	  {


	  	 // fisrt method to create a linked list 
	     System.out.println("\n\nFirst method ")
	 	 Node start=new Node(10);  // Object of node class 
	 	 start.next=new Node(20);
	 	 start.next.next=new Node(30);  // point to next node 

	 	 for(Node p=start ; p!=null ; p=p.next)  // 
	 	 {
	 	 	System.out.println(p.data);  // printing the whole data present in node 
	 	 }

	 	 // 2nd method to create  a linked list 
	 	 System.out.println("\n\nSecond  method ")
	   Node start=new Node(10);
	   Node p=start;
	   p.next=new Node(20);
	   p=p.next;
	   p.next=new Node(30);
	   p=p.next;
	   p.next=new Node(40);

	   for(Node pp=start ; pp!=null ; pp=pp.next)
	   {
	   System.out.println(pp.data);
	   }

	  	 // 3rd method to linked list 
	  	System.out.println("\n\nThird method ")
	     Node start=new Node(11);
	     Node p=start;
	     for(int i=1 ; i<5 ; i++)
	     {
	        p=p.next=new Node(22+11*i);
	     }
	     insert(start , 23);

	     for(Node pp=start ; pp!=null ;pp=pp.next)
	     {
	        System.out.println(pp.data);
	     }
	  }
}