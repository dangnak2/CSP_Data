import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Data extends UnicastRemoteObject implements StudentDataIF, CourseDataIF {

  protected static StudentList studentList;
  protected static CourseList courseList;

  protected Data() throws RemoteException {
    super();
  }

  public static void main(String[] args) throws FileNotFoundException, IOException {
//    System.setProperty("java.rmi.server.hostname","218.38.137.27");

    try{
      Data data = new Data();
      Naming.rebind("Data", data);
      System.out.println("Data is ready!!");

      studentList = new StudentList("Students.txt");
      courseList = new CourseList("Courses.txt");


    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (RemoteException e) {
      e.printStackTrace();
    }
  }

  @Override
  public ArrayList<Student> getAllStudentData() throws RemoteException {
    return studentList.getAllStudentRecords();
  }

  @Override
  public ArrayList<Course> getAllCourseData() throws RemoteException {
    return courseList.getAllCourseRecords();
  }
}
