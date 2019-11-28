import java.util.*;
public class LinkedQueue1
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
         if(size==0)throw new IllegalStateException("LinkedQueue1 is Empty");
         return head.next.object;
         }

         public void add(Object obj)
         {
            head.prev=head.prev.next= new Node(obj , head.prev, head);
            ++size;
         }

         public Object remove()
         {
         if(size==0)throw new IllegalStateException("LinkedQueue1 is Empty");
         Object obj=head.next.object;
         head.next=head.next.next;
         head.next.prev=head;
         --size;
         return obj;
         
         }

      

         public static void main(String [] args)
             {
              LinkedQueue1 q= new LinkedQueue1();
             q.add("Jharna");
             q.add("Komal");
             q.add("Veena");

             System.out.println("Queue  :"+q);
             System.out.println("Size of LinkedQueue1 is "+q.size());

            
             }
	} 