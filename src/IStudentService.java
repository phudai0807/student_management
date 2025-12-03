import java.util.List;

public interface IStudentService {
    void addStudent(Student s);
    List<Student> getAllStudents();
    List<Student> getRegularStudents();
    List<Student> getInServiceStudents();
}