import java.rmi.*;
import java.rmi.server.*;
public class Adder extends UnicastRemoteObject implements AddServiceInterface
{
 public Adder()throws RemoteException
{
  super();
}
public int sum(int n1,int n2)
{
 return n1+n2; 
}

}