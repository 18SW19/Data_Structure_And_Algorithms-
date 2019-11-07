class BinarySearching{
	public static int BinarySearching(String array[],String target){
      int lowerbound=0;
      int upperbound=array.length-1;
     
      while(lowerbound<=upperbound){
      	int mid=(lowerbound+upperbound-1)/2;
            int x=target.compareTo(array[mid]);
      	if(x==0){
      		return mid;
      	}
      		if(x>0){
      			lowerbound=mid+1;
      		}
      	 else{
      			upperbound=mid-1;
             }
      		}
   
      
      return -lowerbound-1;
     }
	public static void main(String args[]){
		 String array[]={"pink","purple","yellow","orange","white","black"};
               String target="white";
		System.out.print("Element found at index "+BinarySearching(array,target));
		//System.out.print("Element found at index "+BinarySearching(array,"orange"));
	}
}