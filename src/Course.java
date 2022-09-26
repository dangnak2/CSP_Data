
import java.io.Serializable;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Course implements Serializable{
  private static final long serialVersionUID = 1L;
  protected String courseId;
  protected String professorName;
  protected String courseName;
  protected ArrayList<String> classRoomList;

  public Course(String inputString) {
    StringTokenizer stringTokenizer = new StringTokenizer(inputString);
    this.courseId = stringTokenizer.nextToken();
    this.professorName = stringTokenizer.nextToken();
    this.courseName = stringTokenizer.nextToken();
    this.classRoomList = new ArrayList<String>();
    while (stringTokenizer.hasMoreTokens()) {
      this.classRoomList.add(stringTokenizer.nextToken());
    }
  }
  public boolean match(String courseId) {
    return this.courseId.equals(courseId);
  }
  public String getProfessorName() {
    return this.professorName;
  }
  public ArrayList<String> getCompletedCourses() {
    return this.classRoomList;
  }
  public String toString() {
    String stringReturn = this.courseId + " " + this.professorName + " " + this.courseName;
    for (int i = 0; i < this.classRoomList.size(); i++) {
      stringReturn = stringReturn + " " + this.classRoomList.get(i).toString();
    }
    return stringReturn;
  }
}
