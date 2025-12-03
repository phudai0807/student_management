import java.util.*;

public class InputInfor {
    public static Student InputInfor(Scanner sc){
        System.out.println("\nInput student");
        System.out.println("Select type: 1. Regular | 2. In-Service ");
        System.out.print("Choice: ");
        String choice = sc.nextLine();

        System.out.print("Student ID: ");
        String studentID = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Date Of Birth: ");
        String dateOfBirth = sc.nextLine();

        int admissionYear = 0;
        while(true){
            try {
                System.out.print("Admission year: ");
                admissionYear = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number.");
            }
        }

        double entranceScore = 0;
        while(true){
            try{
                System.out.print("Entrance Score: ");
                entranceScore = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number.");
            }
        }

        if(choice.equals("2")){
            System.out.print("Training location: ");
            String trainingLocation = sc.nextLine();
            return new InServiceStudent(studentID, name, dateOfBirth, admissionYear, entranceScore, trainingLocation);
        }else{
            return new RegularStudent(studentID, name, dateOfBirth, admissionYear, entranceScore);
        }
    }
}
