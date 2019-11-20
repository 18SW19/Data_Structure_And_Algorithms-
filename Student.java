import java.util.*;
class Student
{
 	String name;
	 int rollno;
		 Student(String name , int rollno )
		 {
		 	 this.name=name;
		 	 this.rollno=rollno;
		 }

		 public String getName()
		 {
		 	return name;
		 }

		 public int getRollno()
		 {
		 	  return rollno;
	     }
}


class LinkedListStudent
{
	 public static void printStudentData(List <Student> list)
	 {
	 	for(Student st: list)
	    {
	    	System.out.println("Name is " + st.getName()+  " \nrollno is  "+ st.getRollno());
	    }
	 }
	
	public static void main(String [] args)
	{
	   LinkedList<Student> list=new LinkedList<Student> ();
	   list.add(new Student("Muntaha" , 01) ); // 1st operation
	   list.add(new Student("Mustaha " , 02 ) ); 
	   list.add(new Student("Basit " , 03 ) ); 
	   list.add(new Student("Zubair " , 04 ) ); 

	   printStudentData(list); // method for printing student record 
	  

	    boolean bol =list.contains("Muntaha"); // 2nd operation
	    if(bol==true)
	    {
	    	System.out.println("Student Muntaha is present");
	    }
	    else
	    {
	    	 System.out.println("Student Muntaha is present");

	    }

	     list.add(4 , new Student( "Zubair " , 04));// 3rd operation :
	       // add student at index 4 

	     // int index=list.indexOf(new Student("Muntaha" , 01 ));
	     // System.out.println("Muntaha present at "+index + " index ");
   

       System.out.println(list.get(4));  //4th operation : it will get the student at 4 index 

       Object arr[]=list.toArray();   // 5th operation: it will convert whole data of student into an array 
       for(int i=0 ; i<arr.length ; i++)
       {
       	System.out.println(arr[i]);
       }
	    



	}
}