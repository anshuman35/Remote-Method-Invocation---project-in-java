import java.rmi.*;
public class AddServer
{
public static void main(String arg[])
{
 try
 {
   AddServiceInterface addService=new Adder();
   Naming.rebind("AddService",addService);
  }
catch(Exception e)
{
	System.out.println(e);
}
 }
}