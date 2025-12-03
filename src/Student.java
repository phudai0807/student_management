import java.util.*;

public abstract class Student{
    private String studentID;
    private String name;
    private String dateOfBirth;
    private int admissionYear;
    private double entranceScore;

    public Student(String studentID, String name, String dateOfBirth, int admissionYear, double entranceScore){
        this.studentID = studentID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.admissionYear = admissionYear;
        this.entranceScore = entranceScore;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public double getEntranceScore() {
        return entranceScore;
    }

    public String toFileString() {
        return "";
    }

    @Override
    public String toString(){
        return String.format("ID: %s, Name: %s, Date of Birth: %s, Year: %d, Score: %s",
                studentID, name, dateOfBirth, admissionYear, entranceScore);
    }
}
