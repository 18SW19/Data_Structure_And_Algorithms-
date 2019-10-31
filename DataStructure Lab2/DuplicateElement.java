

public class DulicateElement {
    public static void main(String args [])
    {
         int i,j=0;
       
        int array[]={20, 20, 30, 40, 50, 50,70};
        int [] temp=new int [array.length];
        for( i=0;i<array.length;i++){
//            for(int j=i+1;j<=array.length;j++)
            if(array[i]!=array[i+1])
            
                temp[j] = array[i]; 
                System.out.print(array[i]+" ");
            j++;
        }
        temp[j]=array[array.length-1];
        
         for ( i=0; i<temp.length; i++) 
         {
             System.out.println(temp[i]+" ");
         }
        }

    }

