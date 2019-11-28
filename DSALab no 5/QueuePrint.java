import java.util.Queue;
import java.util.PriorityQueue;
import java.util.LinkedList;
class QueuePrint 
{
	public static void main(String [] args)
	{
	   //Creaing an object of Queue
	   Queue<String> q = new LinkedList <> ();

	   //Adding the element in queue

	   q.add("10");
	   q.add("12");
	   q.add("14");
	   q.add("16");
	   q.add("18");
           q.add("19");
       //Printing the values of Queue
	   System.out.println("Queue  :"+ q);
       
       //Show the Element at the head of Queue
	   System.out.println("\nElement at the head of Queue : "+q.poll());

	   //Removing element from queue
	  String r= q.remove();

	   System.out.println("\nRemove element from Queue  : "+r+"\n");

	   System.out.println("New Queue : "+q);

	   //Size of Queue
        System.out.println("\n Size of Queue is  : "+q.size());

        //Inserting element using offer
        q.offer("20");
        q.offer("22");
        q.offer("24");
        q.offer("26");


        System.out.println("\n Final Queue  :"+q);

        //Show the Element at the head of Queue
        System.out.println("\n The element at the head of Queue  : "+q.peek());

      
	}
}