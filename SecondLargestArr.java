class SecondLargestArr{
	public static void main(String args[]){
	int x=0;
	int arr[]={20,40,30,60,70};
	for(int i=0;i<arr.length;i++){
	for(int j=i+1;j<arr.length;j++){
	if(arr[i]<arr[j]){
	x=arr[i];
	arr[i]=arr[j];
	arr[j]=x;

	}

	}
	}
	System.out.println("Second largest element in an array is:"+ arr[1]);

	}
}