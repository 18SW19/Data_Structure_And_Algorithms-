import java.util.Arrays;


public class SortTwoDimentional {
 public static void sorting(int [][] arr)
{
int temp;
for(int i=0 ; i<arr.length ; i++)
{
          for(int j=0 ; j<arr[i].length ; j++ ){
          for(int k=0 ; k< arr[i].length-j-1 ; k++){
          if(arr[i][k]>arr[i][k+1])
          {
          temp=arr[i][k];
          arr[i][k]=arr[i][k+1];
          arr[i][k+1]=temp;

          }

          }

}
}

}
public static void print(int [][] arr)
{
for(int i=0 ; i<arr.length ; i++)
{
for(int j=0 ; j<arr[i].length ; j++)
{
System.out.print(arr[i][j]+ " ");
}
System.out.println();
}

}
public static void main(String [] args)
{

int [][] arr={{1 , 3   , 3}  ,{ 2 , 4  , 5}  ,{5 ,4 , 3 , 2, 1}};

System.out.println("Length of array is "+arr.length );
sorting(arr);
print(arr);



}
}

