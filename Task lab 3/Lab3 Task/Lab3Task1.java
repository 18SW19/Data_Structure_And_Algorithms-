class Lab3Task1{
	public static void Searching(String array[], String search){
	int x=1;
	for(int i=0;i<array.length;i++){
	if(array[i].equals(search)){
	break;
	}

	}
	if(x==1){
	System.out.println("Name is found"+ " "+ search);
	}
	else
	System.out.println("name is not found");
	}

	public static void main(String args[]){
	String array[]={"iqra","Shanzay","Soha","Haris","Khuram"};
	String search="Khuram";
	Searching(array,"Khuram");
	}
}