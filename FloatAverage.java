import java.util.Scanner;
class Average
{
	public static float averageFloat()
	{
		int array[]=new int[50];
		float total=0f;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=s.nextInt();
		System.out.println("Enter array elements:");
		for(int i=0;i<size;i++)
		{
			array[i]=s.nextInt();
		   total=total+array[i];
		   
	    }
		return total/size;
	}
}

class FloatAverage
{
	public static void main(String[] args)
	{
        Average a=new Average();
        System.out.println("Average is:"+a.averageFloat());
	}
}