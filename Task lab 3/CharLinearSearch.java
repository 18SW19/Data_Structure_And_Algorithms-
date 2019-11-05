


public class CharLinearSearch {
public static void NameSearch(char [] r,char a)
{
    int i;
    
    int flag=1;
    for( i=0; i<r.length; i++)
    {
        if(r[i]==a)
        {
            break;
        }
    }
    if(flag==1)
    {
        System.out.println("Character found at index "+i);
    }
    else
        System.out.println("Character not found");
}
public static void main(String args [])
{
    char [] r={'a','b','c','d','e','f'};
    char a='e';
    NameSearch( r,'e');
}
}
 