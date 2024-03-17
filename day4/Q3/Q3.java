

public class Q3
{
    public static void main(String[] args)
   {
    ExceptionThrower thrower = new ExceptionThrower();

    try 
    {
        thrower.method1();
    } 
    catch (MyException e) 
    {
        System.out.println("Catched exception: " + e.getMessage());
    } 
    finally 
    {
        System.out.println("Finally block after method1");
    }

    try 
    {
        thrower.method2();
    } 
    catch (MyException e) 
    {
        System.out.println("Catched exception: " + e.getMessage());
    } 
    finally 
    {
        System.out.println("Finally block after method2");
    }

    try 
    {
        thrower.method3();
    } 
    catch (MyException e) 
    {
        System.out.println("Catched exception: " + e.getMessage());
    } 
    finally 
    {
        System.out.println("Finally block after method3");
    }





        
    }
       



}
   