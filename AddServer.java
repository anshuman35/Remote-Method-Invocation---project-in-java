import java.util.*;
import java.rmi.*;
public class AddServer
{

	
	public static void main(String arg[])
{
	try{	
		ArrayList z=new ArrayList();
	}
		catch(Exception i){
			
			
		System.out.println(i);	
		}
		
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
