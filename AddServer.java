import java.util.*;
import java.rmi.*;
public class AddServer
{

	
	public static void main(String arg[])
{
		
		ArrayList z=new ArrayList();
		
		
 try
 {
   AddServiceInterface addService=new Adder(z);
   Naming.rebind("AddService",addService);
  }
catch(Exception e)
{
	System.out.println(e);
}
 }
}
