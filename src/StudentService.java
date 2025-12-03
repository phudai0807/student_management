import java.io.FileNotFoundException;
import java.util.*;

public class StudentService implements IStudentService{
    private StudentRepository repository;
    private List<Student> students;

    public StudentService() throws FileNotFoundException {
        this.repository = new StudentRepository();
        this.students = repository.loadFromFile();
    }

    @Override
    public void addStudent(Student s){
        this.students.add(s);
        repository.saveToFile(this.students);
    }

    @Override
    public List<Student> getAllStudents() {
        return this.students;
    }

    @Override
    public List<Student> getRegularStudents() {
        List<Student> result = new ArrayList<>();
        for(Student s : students){
            if(s instanceof RegularStudent){
                result.add(s);
            }
        }
        return result;
    }

    @Override
    public List<Student> getInServiceStudents() {
        List<Student> result = new ArrayList<>();
        for(Student s : students){
            if(s instanceof InServiceStudent){
                result.add(s);
            }
        }
        return result;
    }
}
