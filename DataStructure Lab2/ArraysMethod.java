
import java.util.Arrays;

public class ArraysMethod {
     
public static void printArray(short arr[]){
   for(int i=0 ; i<arr.length ; i++)
   {
       System.out.println(arr[i]);
   }
   
}

    
public static void printArray2(long arr[])
{
     for(int i=0 ; i<arr.length ; i++)
     {
         System.out.println(arr[i]);
     }
     
}

        

    public static void main(String []args)
    {
      long array[]={1,2,3,48,6,4};
        long array3[]={1,2,3,48,6,4};
      System.out.println("before  sorting Array1  ");
      printArray2(array);
      System.out.println("After sorting Array1 ");
      Arrays.sort(array , 2 ,6);
      printArray2(array);
       
       
      
      System.out.println("Binary searching of 3 in Array1:"+Arrays.binarySearch(array,3));
      
      
     
      short[] arr={1 ,2 , 3, 4, 5};        
      System.out.println("Copy  of an Array 2");
      short arraycopy []= Arrays.copyOf(arr, 5);
      printArray(arraycopy);
      
      
      System.out.println("Filling of array with 2");
      Arrays.fill(array , 2);
      printArray2(array);
      
      
      System.out.println("checking equlatity of an array ");
     System.out.println(Arrays.equals(array   , array3));
     
     
       
          
      
      
      
      
      
        
    }

 
    }

