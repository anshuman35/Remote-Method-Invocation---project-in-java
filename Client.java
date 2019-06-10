import javax.servlet.HttpServletRequest;
import java.rmi.*;
public class Client
{
 
 public void doGet(HttpServletRequest z)
  
 {
  
  z.getParameter("http://google.com.au");
 }
 
 
 
 public static void main(String arg[])
{int a,b;
 
 
 
 
 java.util.Scanner sc=new java.util.Scanner(System.in);
 try
 {
  AddServiceInterface st=(AddServiceInterface)Naming.lookup("rmi://"+arg[0]+"/AddService");
  System.out.println("Enter the two number for addition");
  a=sc.nextInt();
  b=sc.nextInt();	
  System.out.println(st.sum(a,b));
 }
 catch(Exception e)
{
  System.out.println(e);

}

}
}
