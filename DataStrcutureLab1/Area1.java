import java.util.*;


public class Area1 {
    
    int length;
    int breadth;
     Area1(int length , int breadth)
     {
   
    
        this.length = length;
        this.breadth=breadth;
        
    }

    public void returnArea()
    {
        System.out.println("Area of rectangle  :"+length*breadth);
    }
    


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
       int  length=sc.nextInt();
        System.out.println("enter breadth");
       int breadth= sc.nextInt();
        
        
        Area1 a=new Area1(length, breadth);
        a.returnArea();
        
    }
}


