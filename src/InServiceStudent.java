import java.util.*;

public class InServiceStudent extends Student{
    private String trainingLocation;

    public InServiceStudent(){
        super();
    }

    @Override
    public void inputInfor(Scanner sc){
        super.inputInfor(sc);
        System.out.print("Enter Training Location: ");
        this.trainingLocation = sc.nextLine();
    }

    @Override
    public void outputInfor(){
        super.outputInfor();
        System.out.printf("Type: In Service, Training Location: %s", trainingLocation);
    }

    @Override
    public String getStudentType() {
        return "InService";
    }
}
