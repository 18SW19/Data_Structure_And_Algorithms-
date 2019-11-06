public class StringLinearSearch1{
    public static void  NameSearch(String [] arr, String search){
   int flag=1;
    for(int i=0; i<arr.length; i++)
    {
        if(arr[i].equals(search))
        {
            break;
        } 
    }
    if(flag==1)
    {
        System.out.println("Name is found "+search);
    }
        else 
            System.out.println("Name not found");




}
    public static void main(String args [])
    {

     String [] arr={"Dua","Mahrukh","Iqraa","Jharna","Yusra","Isra"};
  //  String search = "Jharna";
     NameSearch( arr, "Jharna");
    }

}