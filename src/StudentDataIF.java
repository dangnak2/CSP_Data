import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface StudentDataIF extends Remote {
  ArrayList<Student> getAllStudentData() throws RemoteException;
}
