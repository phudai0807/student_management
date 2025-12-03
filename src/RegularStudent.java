import java.util.*;

public class RegularStudent extends Student{
    public RegularStudent(String studentID, String name, String dateOfBirth, int admissionYear, double entranceScore){
        super(studentID, name, dateOfBirth, admissionYear, entranceScore );
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: Regular";
    }

    @Override
    public String toFileString() {
        return "REGULAR," + getStudentID() + "," + getName() + "," + getDateOfBirth() + "," + getAdmissionYear() + "," + getEntranceScore();
    }
}
