public class Patient {
    private String name;
    private int age;
    private String doctor;
    private int patientId;


    //constructor
    public Patient(String name, int age, String doctor, int patientId) {
        this.name = name;
        this.age = age;
        this.doctor = doctor;
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }


    public String toString() {
        return "Name: " + name + "; Age: " + age + "; Doctor: " + doctor + "; Patient ID: " + patientId ;
    }

    //tester
    public static void main(String[] args) {
        Patient p = new Patient("Takudzwa George Mutevhani", 20, "S.Williams", 4567);
        System.out.println(p);
    }

}
