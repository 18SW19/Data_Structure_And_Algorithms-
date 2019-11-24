import java.util.*;
public class LinkedQueue 
{
	private Node head = new Node (null);
	private int size;
	private static class Node
	{
         Object object;
         Node prev=this;
         Node  next= this;
         Node(Object object , Node prev , Node next)
         {
             this.object= object;
             this.next=next;
             this.prev=prev;
         }

         public Node(Object object)
         {
                 this.object=object;
         }
    }
         public int size()
         {
         	return size;
         }

         public Object first()
         {
         if(size==0)throw new IllegalStateException("LinkedQueue is Empty");
         return head.next.object;
         }

         public void add(Object obj)
         {
            head.prev=head.prev.next= new Node(obj , head.prev, head);
            ++size;
         }

         public Object remove()
         {
         if(size==0)throw new IllegalStateException("LinkedQueue is Empty");
         Object obj=head.next.object;
         head.next=head.next.next;
         head.next.prev=head;
         --size;
         return obj;
         
         }

      

         public static void main(String [] args)
             {
              LinkedQueue q= new LinkedQueue();
             q.add("Muntaha");
             q.add("Zubair");
             q.add("Basit");

             System.out.println("Queue  :"+q);
             System.out.println("Size of LinkedQueue is "+q.size());

            
             }
	} 
	 