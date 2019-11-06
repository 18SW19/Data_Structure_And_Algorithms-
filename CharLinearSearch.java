public class CharLinearSearch {
public static void NameSearch(char [] a,char b)
{
    int i;

    int flag=1;
    for( i=0; i<a.length; i++)
    {
        if(a[i]==b)
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
    char [] r={'o','p','q','r','s','s'};
    char a='e';
    NameSearch( r,'e');
}
}

