
import java.util.Arrays;


class StringBinarySarch
{
    static String [] array={"Apple","Banana","Grapes","Orange","Pine Apple","Baby Corn"};
    static String search = "Grapes";
    
    
    static char [] arr={'a','b','c','d','e','f','g'};
    static char value='d';
    
    static int lp=0;
    static int up=array.length-1;
    static int upper=arr.length-1;
    
    static int mid;
   public static int  StringBinarySarch()
    {
            while(lp<=up)
            {
                mid=(lp+up)/2;

                if(array[mid].compareTo(search)<0)
                {
                    lp=mid+1;
                }
                else if(array[mid].compareTo(search)>0)
                {
                    up=mid-1;
                }
                else
                {
                    return mid;
                }
                    
             }
            return -lp-1;
    }
   
   
   
   
   
    public static int BinarySarch()
    {
            while(lp<=upper)
            {
                mid=(lp+upper)/2;
                 
                if(arr[mid]>value )
                {
                    lp=mid+1;
                }
                else if(arr[mid]<value)
                {
                    up=mid-1;
                }
                else
                {
                    return mid;
                }
//                    
             }
           return -lp-1;
    }
   public static void main(String args [])
   {   
       System.out.println("String binary Search");
       System.out.println("Searching value is  "+search);
       for(int k=0;k<array.length;k++)
       {
           System.out.print(array[k]+" ");
       }
       System.out.println("\nvalue is found "+StringBinarySarch()+" Position");
       
       System.out.println("\n Binary search in character");
       for(int p=0;p<arr.length;p++)
       {
           System.out.print(arr[p]+" ");
       }
       System.out.println("\nSearch value is  "+value);
           System.out.println("\nSearching vales is found at "+BinarySarch()+" Position");
       
   }
}