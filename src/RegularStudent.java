import java.util.*;

public class RegularStudent extends Student{
    public RegularStudent(){
        super();
    }

    @Override
    public void inputInfor(Scanner sc) {
        super.inputInfor(sc);
    }

    @Override
    public void outputInfor(){
        super.outputInfor();
        System.out.println("Type: Regular");
    }

    @Override
    public String getStudentType() {
        return "Regular";
    }
}
