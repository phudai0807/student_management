import java.util.*;

public abstract class Student implements StudentActions{
    private String studentID;
    private String name;
    private String dateOfBirth;
    private int admissionYear;
    private double entranceScore;

    public Student(){

    }

    @Override
    public void inputInfor(Scanner sc){
        System.out.print("Enter Student ID: ");
        this.studentID = sc.nextLine();
        System.out.print("Enter Full Name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Date of Birth: ");
        this.dateOfBirth = sc.nextLine();
        System.out.print("Enter Admission Year: ");
        this.admissionYear = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Entrance Score: ");
        this.entranceScore = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void outputInfor(){
        System.out.printf("ID: %s , Name: %s , Date Of Birth: %s , Admission Year: %d , Entrance Score: %f ",
                studentID, name, dateOfBirth, admissionYear, entranceScore);
    }
}
