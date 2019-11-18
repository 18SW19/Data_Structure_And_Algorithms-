
import java.util.*;
public class StudentTask1 extends Person{
  public static void main(String[] args) {
    LinkedList<String>instance=new LinkedList<String>();
    System.out.println("Student:"+ instance.add("18SW02"));
    System.out.println("Size:"+ instance.size());
    System.out.println("Roll no:"+ instance.getFirst());
    System.out.println("Last:"+ instance.getLast());
    System.out.println(" "+instance.peek());
    System.out.println(" "+instance.pop());
    System.out.println(" "+instance.offerFirst("Mahrukh"));
    System.out.println(" "+instance.offerLast("Software"));
    System.out.println(" "+instance.pollFirst());
    System.out.println(" "+instance.pollLast());

    
  }
}