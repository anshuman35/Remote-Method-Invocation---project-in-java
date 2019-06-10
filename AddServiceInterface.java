import java.rmi.*;


class Remote
{
  
  public int n1;
  
}



public interface AddServiceInterface extends Remote




{





public int sum(int n1,int n2)



throws RemoteException;
}
