public class InServiceStudent extends Student{
    private String trainingLocation;

    public InServiceStudent(String studentID, String name, String dateOfBirth, int admissionYear, double entranceScore, String trainingLocation){
        super(studentID, name, dateOfBirth, admissionYear, entranceScore );
        this.trainingLocation = trainingLocation;
    }

    @Override
    public String toFileString() {
        return "INSERVICE," + getStudentID() + "," + getName() + "," + getDateOfBirth() + "," + getAdmissionYear() + "," + getEntranceScore() + "," + getTrainingLocation();
    }

    public String getTrainingLocation() {
        return trainingLocation;
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: In - Service, Location: " + trainingLocation;
    }

}
