import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<StudentActions> studentList = new ArrayList<>();

        while(true){
            System.out.println("\n=== MENU: MIDTERM EXAM SOLUTION ===");
            System.out.println("1. Input N students ");
            System.out.println("2. Print student list ");
            System.out.println("3. Filter by type ");
            System.out.println("0. Exit");
            System.out.print("Select your choice: ");

            String choice = sc.nextLine();

            switch (choice){
                case "1":
                    // Input N student
                    System.out.print("Enter number of students: ");
                    int n;
                    try{
                        n = Integer.parseInt(sc.nextLine());
                        inputInfor(n, studentList, sc);
                    }catch(NumberFormatException e){
                        System.out.println("Invalid number.");
                        return;
                    }
                    break;

                case "2":
                    // Print list student
                    System.out.println("\n--- LIST OF ALL STUDENTS ---");
                    printList(studentList);
                    break;

                case "3":
                    //Filter and print by type
                    System.out.println("\n--- FILTER BY TYPE ---");
                    filterAndPrint(studentList, "Regular");
                    filterAndPrint(studentList, "InService");
                    break;

                case "0":
                    // Exit program
                    System.out.println("Exiting program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter 0, 1, 2, or 3.");
            }
        }
    }

    private static void inputInfor(int n, List<StudentActions> studentList, Scanner sc) {
        for(int i = 0; i < n; i++){
            System.out.println("\nInput student " + (i + 1));
            System.out.println("Select type: 1. Regular | 2. In-Service ");
            System.out.print("Choice: ");
            String choice = sc.nextLine();

            StudentActions student;

            if(choice.equals("2")){
                student = new InServiceStudent();
            }else{
                student = new RegularStudent();
            }

            student.inputInfor(sc);
            studentList.add(student);
        }
    }

    private static void printList(List<StudentActions> studentList) {
        if(studentList.isEmpty()){
            System.out.println("List is empty.");
            return;
        }

        for(StudentActions s : studentList){
            s.outputInfor();
            System.out.println();
        }
    }

    private static void filterAndPrint(List<StudentActions> studentList, String type) {
        String display;
        if(type.equals("Regular")){
            display = "Regular Student";
        }else{
            display = "In-Service Student";
        }

        System.out.println("\nFiltering: " + display);

        boolean check = false;
        for(StudentActions s : studentList){
            if(s.getStudentType().equals(type)){
                s.outputInfor();
                System.out.println();
                check = true;
            }
        }

        if(!check){
            System.out.println("No students found of this type");
        }
    }
}