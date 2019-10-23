
public class Employee {
    
    public int salary=1;
    public int hour=1;
    private void getInfo(int salary,int hour)
    {
         
        this.salary=salary;
        this.hour=hour;
        

    }
    private int AddS(){
    
        if(salary<500)
        {
            salary +=10;
        }
        System.out.println("Salary :"+salary+"$");
       return salary;
    }
    private void Addwork(){
        if(hour>=6)
        {
            hour+=5;
            
        }
          System.out.println("Hour  :"+hour);
           }
    public static void main(String args[])
    {
        Employee e=new Employee();
        e.getInfo(450,10 );
        e.AddS();
        e.Addwork();
    }
           
            
}
