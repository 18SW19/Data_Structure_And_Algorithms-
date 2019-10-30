
public class ArrayTesting
{ public static boolean contains(int[] array, int item) {
      for (int n : array) {
         if (item == n) {
            return true;
         }
    
      }
      return false;
}
    public static void main(String args [])
    {
        int array[]={1,5,3,6,3,7,4,5,3,564,45,343,2463,54,35,353,342,53,2342,212,131,121,33,
            131,34,153,32,121,563,24,6,4, 5,63,67,334,66,556,8,90,68,0,6,43,5,6,45,43,34,5,6,46,35,34,
            34,56,78,9,1, 22,4,5,6,2, 22,99,45,879,9,43,23,67,98,45,2,3,89,56,98,45,78,99,12,34,56,65,
            88,77,76,67,56,11,2,15,16,17,66,77};
        
            System.out.println(contains(array,6));
            
        }
    }

