import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface CourseDataIF extends Remote {
  ArrayList<Course> getAllCourseData() throws RemoteException;

}
