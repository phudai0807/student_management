import java.io.*;
import java.util.*;

public class StudentRepository {
    private final String FILE_NAME = "F:\\studentmanagement\\src\\students.txt";

    public void saveToFile(List<Student> students){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))){
            for(Student s: students){
                writer.write(s.toFileString());
                writer.newLine();
            }
            System.out.println("-> Data saved to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Error saving file");
        }
    }

    public List<Student> loadFromFile() throws FileNotFoundException {
        List<Student> list = new ArrayList<>();
        File file = new File(FILE_NAME);

        if(!file.exists()){
            return list;
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){
            String line;
            while((line = reader.readLine()) != null){
                String[] parts = line.split(",");
                if(parts.length < 6) continue;

                String type = parts[0];
                String id = parts[1];
                String name = parts[2];
                String dob = parts[3];
                int year = Integer.parseInt(parts[4]);
                double score = Double.parseDouble(parts[5]);

                if(type.equals("REGULAR")){
                    list.add(new RegularStudent(id, name, dob, year, score));
                }else if(type.equals("INSERVICE") && parts.length >= 7){
                    String location = parts[6];
                    list.add(new InServiceStudent(id, name, dob, year, score, location));
                }
            }
            System.out.println("-> Data loaded from " + FILE_NAME);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading file");
        }
        return list;
    }
}
