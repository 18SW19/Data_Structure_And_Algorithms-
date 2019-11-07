class LinearSearching{
	public static void SearchingChar(char ch[],char c){
	int x;
	int y=1;
	for(x=0;x<ch.length;x++){
	if(ch[x]==c){
	break;
	}
	}
	if(y==1){
	System.out.println("Character found"+  x);
	}
	else
	System.out.println("Character not found");
	}
	public static void main(String args[]){
	char ch[]={'i','q','r','a'};
	char c='a';
	SearchingChar(ch, c);
	}
}