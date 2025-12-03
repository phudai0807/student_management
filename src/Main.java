import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        IStudentService service = new StudentService();

        while(true){
            System.out.println("\n=== STUDENT MANAGER ===");
            System.out.println("1. Input N students ");
            System.out.println("2. Print student list ");
            System.out.println("3. Filter Regular");
            System.out.println("4. Filter In-Service");
            System.out.println("0. Exit");
            System.out.print("Select your choice: ");

            String choice = sc.nextLine();

            switch (choice){
                case "1":
                    // Input N student
                    System.out.print("Enter number of students: ");
                    try{
                        int n = Integer.parseInt(sc.nextLine());
                        for(int i = 0; i < n; i++){
                            Student s = InputInfor.InputInfor(sc);
                            service.addStudent(s);
                        }
                    }catch(NumberFormatException e){
                        System.out.println("Invalid number.");
                        return;
                    }
                    break;

                case "2":
                    // Print list student
                    System.out.println("\n--- LIST OF ALL STUDENTS ---");
                    for(Student s : service.getAllStudents()){
                        System.out.println(s);
                    }
                    break;

                case "3":
                    //Filter Regular Students
                    System.out.println("\n--- Regular Students ---");
                    for(Student s : service.getRegularStudents()){
                        System.out.println(s);
                    }
                    break;

                case "4":
                    //Filter In-Service Students
                    System.out.println("\n--- In-Service Students ---");
                    for(Student s : service.getInServiceStudents()){
                        System.out.println(s);
                    }
                    break;

                case "0":
                    // Exit program
                    System.out.println("Exiting program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter 0, 1, 2, 3, or 4.");
            }
        }
    }
}