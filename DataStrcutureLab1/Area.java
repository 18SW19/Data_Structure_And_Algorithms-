import java.util.*;

public class Area {
  
    int length;
    int breadth;
    public void setDim( int length , int breadth)
    {
        this.length = length;
        this.breadth=breadth;
        
    }
    public void getArea()
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
        
        
        Area a=new Area();
        a.setDim(length, breadth);
        a.getArea();
        
    }
}
